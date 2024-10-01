package crudJava.service;

import crudJava.clases.User;
import crudJava.repository.UserRepository;

/**
 * The type User service.
 */
public class UserService {
    private final UserRepository ur;

    public UserService() {
        ur = new UserRepository();
    }

    public boolean deleteUser(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return false;
        }
        User u = ur.findUser(nombre);
        if (u == null) {
            return false;
        }
        ur.delUser(u);
        return ur.findUser(nombre) == null;
    }

    public User getUser(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.length() > 255) {
            return null;
        }
        return ur.findUser(nombre);
    }

    public User createUser(User user) {
        if (user == null) {
            return null;
        }
        if (user.getName() == null || user.getName().isEmpty() || user.getName().length() > 255) {
            return null;
        }
        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() > 255) {
            return null;
        }
        return ur.createUser(user);
    }
}