
package com.mycompany.login.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {
    
    @Id
    //@GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id;
    private String userName;
    private String password;
    @ManyToOne
    @JoinColumn (name = "Fk_rol")
    private Rol unRol;
    

    public User() {
    }

    public User(int id, String userName, String password, Rol unRol) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.unRol = unRol;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }


    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
