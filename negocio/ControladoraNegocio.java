package com.mycompany.login.negocio;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraNegocio {

    ControladoraPersistencia controlPersis;

    public ControladoraNegocio() {
        controlPersis = new ControladoraPersistencia();
    }

    public User userValidate(String user, String pass) {

        List<User> userList = controlPersis.traerUsuarios();

        for (User usr : userList) {

            if (usr.getUserName().equals(user) && usr.getPassword().equals(pass)) return usr;   
        }
        return null;
    }


}
