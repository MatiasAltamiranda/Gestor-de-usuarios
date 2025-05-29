/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.persistencia;

import com.mycompany.login.negocio.Rol;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.login.negocio.User;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Matias Altamiranda
 */
public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
        public RolJpaController() {
        emf = Persistence.createEntityManagerFactory("loginPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Rol rol) {
        if (rol.getListaUsuarios() == null) {
            rol.setListaUsuarios(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedListaUsuarios = new ArrayList<User>();
            for (User listaUsuariosUserToAttach : rol.getListaUsuarios()) {
                listaUsuariosUserToAttach = em.getReference(listaUsuariosUserToAttach.getClass(), listaUsuariosUserToAttach.getId());
                attachedListaUsuarios.add(listaUsuariosUserToAttach);
            }
            rol.setListaUsuarios(attachedListaUsuarios);
            em.persist(rol);
            for (User listaUsuariosUser : rol.getListaUsuarios()) {
                Rol oldUnRolOfListaUsuariosUser = listaUsuariosUser.getUnRol();
                listaUsuariosUser.setUnRol(rol);
                listaUsuariosUser = em.merge(listaUsuariosUser);
                if (oldUnRolOfListaUsuariosUser != null) {
                    oldUnRolOfListaUsuariosUser.getListaUsuarios().remove(listaUsuariosUser);
                    oldUnRolOfListaUsuariosUser = em.merge(oldUnRolOfListaUsuariosUser);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId());
            List<User> listaUsuariosOld = persistentRol.getListaUsuarios();
            List<User> listaUsuariosNew = rol.getListaUsuarios();
            List<User> attachedListaUsuariosNew = new ArrayList<User>();
            for (User listaUsuariosNewUserToAttach : listaUsuariosNew) {
                listaUsuariosNewUserToAttach = em.getReference(listaUsuariosNewUserToAttach.getClass(), listaUsuariosNewUserToAttach.getId());
                attachedListaUsuariosNew.add(listaUsuariosNewUserToAttach);
            }
            listaUsuariosNew = attachedListaUsuariosNew;
            rol.setListaUsuarios(listaUsuariosNew);
            rol = em.merge(rol);
            for (User listaUsuariosOldUser : listaUsuariosOld) {
                if (!listaUsuariosNew.contains(listaUsuariosOldUser)) {
                    listaUsuariosOldUser.setUnRol(null);
                    listaUsuariosOldUser = em.merge(listaUsuariosOldUser);
                }
            }
            for (User listaUsuariosNewUser : listaUsuariosNew) {
                if (!listaUsuariosOld.contains(listaUsuariosNewUser)) {
                    Rol oldUnRolOfListaUsuariosNewUser = listaUsuariosNewUser.getUnRol();
                    listaUsuariosNewUser.setUnRol(rol);
                    listaUsuariosNewUser = em.merge(listaUsuariosNewUser);
                    if (oldUnRolOfListaUsuariosNewUser != null && !oldUnRolOfListaUsuariosNewUser.equals(rol)) {
                        oldUnRolOfListaUsuariosNewUser.getListaUsuarios().remove(listaUsuariosNewUser);
                        oldUnRolOfListaUsuariosNewUser = em.merge(oldUnRolOfListaUsuariosNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<User> listaUsuarios = rol.getListaUsuarios();
            for (User listaUsuariosUser : listaUsuarios) {
                listaUsuariosUser.setUnRol(null);
                listaUsuariosUser = em.merge(listaUsuariosUser);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
