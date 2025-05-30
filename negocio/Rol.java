
package com.mycompany.login.negocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Rol implements Serializable {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String tipoRol;
    private String descripcion;
    @OneToMany (mappedBy= "unRol")
    private List<User> listaUsuarios;

    public Rol() {
    }

    public Rol(int id, String tipoRol, String descripcion, List<User> listaUsuarios) {
        this.id = id;
        this.tipoRol = tipoRol;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }

    public List<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
