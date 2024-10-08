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
     * @param nombre  the nombre
     * @param newName the new name
     * @param newPass the new pass
     * @return the user
     */
    public User updateUser(String nombre, String newName, String newPass) { // TODO no actualiza correctamente
        if (nombre == null || nombre.isEmpty() || nombre.length() > 255 ||
                ((newName == null || newName.isEmpty() || newName.length() > 255)
                        && (newPass == null || newPass.isEmpty() || newPass.length() > 255))) {
            return null;
        }

        User oldUser = ur.findUser(nombre);
        if (oldUser == null) return null;

        User modifiedUser = new User("", "");
        if (newName == null || newName.isEmpty()) modifiedUser.setName(oldUser.getName());
        else modifiedUser.setName(newName);

        if (newPass == null || newPass.isEmpty()) modifiedUser.setPassword(oldUser.getPassword());
        else modifiedUser.setPassword(newPass);

        return ur.updateUser(nombre, modifiedUser);
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    public List<User> getAllUsers() {
        if (ur.getAllUsers() == null) {
            return null;
        }
        return ur.getAllUsers();
    }
}