package com.mycompany.login.negocio;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.Set;

public class ControladoraNegocio {

    ControladoraPersistencia controlPersis;

    public ControladoraNegocio() {
        controlPersis = new ControladoraPersistencia();
    }

    public User userValidate(String user, String pass) {

        List<User> userList = controlPersis.getUsers();

        for (User usr : userList) {

            if (usr.getUserName().equals(user) && usr.getPassword().equals(pass)) {
                return usr;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return controlPersis.getUsers();
    }

    public List<Rol> getRoles() {
        return controlPersis.getRoles();
    }

    public void createUser(String usuario, String pass, String rol) {

        User user = new User();
        user.setUserName(usuario);
        user.setPassword(pass);

        Rol role = new Rol();
        role = this.getRol(rol);

        if (role != null) {
            user.setUnRol(role);
        }

        int id = this.searchLastIdForUsers();
        user.setId(id + 1);

        controlPersis.createUser(user);
    }

    private Rol getRol(String rol) {
        List<Rol> rolList = controlPersis.getRoles();

        for (Rol role : rolList) {
            if (role.getTipoRol().equals(rol)) {
                return role;
            }
        }
        return null;
    }

    private int searchLastIdForUsers() {
        List<User> userList = this.getUsers();
        User user = userList.get(userList.size() - 1);
        return user.getId();

    }

    public void deleteUser(int userId) {
        controlPersis.deleteUser(userId);
    }

    public User getUser(int userId) {
        return controlPersis.getUser(userId);
    }

    public void editUser(User usu, String usuario, String pass, String rol) {
        usu.setUserName(usuario);
        usu.setPassword(pass);

        Rol role = new Rol();
        role = this.getRol(rol);
        if (role != null)usu.setUnRol(role);
        
        controlPersis.editUser(usu);

    }

}
