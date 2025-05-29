
package com.mycompany.login.persistencia;

import com.mycompany.login.negocio.User;
import java.util.List;


public class ControladoraPersistencia {
    
    UserJpaController userJpa = new UserJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<User> traerUsuarios() {
       return userJpa.findUserEntities();
    }
}
