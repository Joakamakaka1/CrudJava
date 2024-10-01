package crudJava.service;

import crudJava.clases.User;
import crudJava.repository.UserRepository;

import java.util.List;

/**
 * The type User service.
 */
public class UserService {
    private final UserRepository ur;

    /**
     * Instantiates a new User service.
     */
    public UserService() {
        ur = new UserRepository();
    }

    /**
     * Delete user boolean.
     *
     * @param nombre the nombre
     * @return the boolean
     */
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

    /**
     * Gets user.
     *
     * @param nombre the nombre
     * @return the user
     */
    public User getUser(String nombre) {
        if (nombre == null || nombre.isEmpty() || nombre.length() > 255) {
            return null;
        }
        return ur.findUser(nombre);
    }

    /**
     * Create user.
     *
     * @param user the user
     * @return the user
     */
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

    /**
     * Update user user.
     *
     * @param user the user
     * @return the user
     */
    public User updateUser(User user) {
        if (user == null) {
            return null;
        }
        if (user.getName() == null || user.getName().isEmpty() || user.getName().length() > 255) {
            return null;
        }
        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() > 255) {
            return null;
        }

        User u = ur.findUser(user.getName());
        if (u == null) {
            return null;
        }

        u.setName(user.getName());
        return u;
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    public List<User> getAllUsers() {
        if(ur.getAllUsers() == null) {
            return null;
        }
        return ur.getAllUsers();
    }
}