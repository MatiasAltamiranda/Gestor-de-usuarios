
package com.mycompany.login.persistencia;

import com.mycompany.login.negocio.Rol;
import com.mycompany.login.negocio.User;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    UserJpaController userJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<User> getUsers() {
       return userJpa.findUserEntities();
    }

    public List<Rol> getRoles() {
        return rolJpa.findRolEntities();
    }

    public void createUser(User user) {
        userJpa.create(user);
    }

    public void deleteUser(int userId) {
        try {
            userJpa.destroy(userId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
