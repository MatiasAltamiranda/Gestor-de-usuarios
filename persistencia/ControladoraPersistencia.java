
package com.mycompany.login.persistencia;

import com.mycompany.login.negocio.Rol;
import com.mycompany.login.negocio.User;
import java.util.List;


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
}
