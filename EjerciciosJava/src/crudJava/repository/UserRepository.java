package crudJava.repository;

import crudJava.clases.Respuestas;
import crudJava.clases.User;

import java.lang.reflect.Array;
import java.net.ResponseCache;
import java.util.ArrayList;

/**
 * Clase encargada de acceder a la BD ( En este caso la ArrayList )
 */

public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    /**
     * Create user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */

    public Respuestas createUser(User user) {
        users.add(user);
        return new Respuestas(201, "User created successfully", user);
    }

    /**
     * Read user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */

    public Respuestas readUser(User user) {
        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                return new Respuestas(200, "User found", u);
            }
        }
        return new Respuestas(404, "User not found", null);
    }

    /**
     * Update user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */

    public Respuestas updateUser(User user) {
        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                u.setName(user.getName());
                u.setPassword(user.getPassword());
                return new Respuestas(200, "User updated successfully", u);
            }
        }
        return new Respuestas(404, "User not found", null);
    }

    /**
     * Delete user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */

    public Respuestas deleteUser(User user) {
        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                users.remove(u);
                return new Respuestas(200, "User deleted successfully", null);
            }
        }
        return new Respuestas(404, "User not found", null);
    }
}
