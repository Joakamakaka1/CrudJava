package crudJava.controller;

import crudJava.clases.Respuestas;
import crudJava.clases.User;
import crudJava.service.UserService;

import java.util.List;

/**
 * The type User controller.
 */
public class UserController {
    private final UserService us;

    /**
     * Instantiates a new User controller.
     */
    public UserController() {
        us = new UserService();
    }

    /**
     * Delete user respuestas.
     *
     * @param nombre the nombre
     * @return the respuestas
     */
    public Respuestas deleteUser(String nombre) {
        try {
            if (us.getUser(nombre) == null) {
                return new Respuestas(404, "Usuario no encontrado", null); // Not found
            }

            return us.deleteUser(nombre) ?
                    new Respuestas(200, "Usuario eliminado con éxito", null) :
                    new Respuestas(400, "Bad request", null); // Bad request
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null); // Internal server error
        }
    }

    /**
     * Search user respuestas.
     *
     * @param nombre the nombre
     * @return the respuestas
     */
    public Respuestas searchUser(String nombre) {
        try {
            User user = us.getUser(nombre);
            if (user == null) {
                return new Respuestas(404, "Usuario no encontrado", null); // Not found
            }
            return new Respuestas(200, "Usuario encontrado con éxito", user); // OK
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null); // Internal server error
        }
    }

    /**
     * Create user respuestas.
     *
     * @param nombre   the nombre
     * @param password the password
     * @return the respuestas
     */
    public Respuestas createUser(String nombre, String password) {
        try {
            if (us.getUser(nombre) != null) {
                return new Respuestas(409, "Conflicto: Usuario ya existe", null); // Conflict
            }

            return us.createUser(new User(nombre, password)) != null ?
                    new Respuestas(201, "Usuario creado con éxito", null) : // Created
                    new Respuestas(400, "Bad request", null); // Bad request
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null); // Internal server error
        }
    }

    /**
     * Update user respuestas.
     *
     * @param nombre  the nombre
     * @param newName the new name
     * @return the respuestas
     */
    public Respuestas updateUser(String nombre, String newName) { // TODO no actualiza correctamente
        try {
            User user = us.getUser(nombre);
            if (user == null) {
                return new Respuestas(404, "Usuario no encontrado", null); // Not found
            }

            if (newName == null || newName.isEmpty()) {
                return new Respuestas(400, "Bad request", null); // Bad request
            }

            if (us.getUser(newName) != null) {
                return new Respuestas(409, "Conflicto: Nuevo nombre ya existe", null); // Conflict
            }

            return us.updateUser(new User(nombre, newName)) != null ?
                    new Respuestas(200, "Usuario actualizado con éxito", null) : // OK
                    new Respuestas(403, "Prohibido: No se puede actualizar", null); // Forbidden
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null); // Internal server error
        }
    }

    /**
     * Gets all users.
     *
     * @return the all users
     */
    public Respuestas getAllUsers() { // No es necesario de hacer
        try {
            List<User> users = us.getAllUsers();
            if (users.isEmpty()) {
                return new Respuestas(204, "No hay usuarios disponibles", null); // No content
            }
            return new Respuestas(200, "Usuarios obtenidos con éxito", users); // OK
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null); // Internal server error
        }
    }
}