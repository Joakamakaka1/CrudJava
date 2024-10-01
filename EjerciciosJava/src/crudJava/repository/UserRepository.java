package crudJava.repository;

import crudJava.clases.Respuestas;
import crudJava.clases.User;

import java.util.ArrayList;

/**
 * The type User repository.
 */
public class UserRepository {
    private final ArrayList<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("Joaquin", "123456"));
    }

    /* Antiguo
    public Respuestas createUser(User user) {
        if (user == null) {
            return new Respuestas(400, "No se proporcionó un usuario válido", null);
        }
        if (user.getName() == null || user.getPassword() == null) {
            return new Respuestas(400, "El nombre de usuario y la contraseña son obligatorios", null);
        }
        for (User u : users) {
            if (u.getName().equals(user.getName())) {
                return new Respuestas(409, "El nombre de usuario ya existe, por favor elija otro", null);
            }
        }
        if (user.getPassword().length() < 6) {
            return new Respuestas(403, "La contraseña debe tener al menos 6 caracteres", null);
        }

        try {
            users.add(user);
            return new Respuestas(201, "Usuario creado con éxito", user);
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor al crear el usuario", null);
        }
    }
    */

    /**
     * Read user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */
    public Respuestas readUser(User user) {
        if (user == null) {
            return new Respuestas(400, "No se proporcionó un usuario válido", null);
        }
        if (user.getName() == null || user.getPassword() == null) {
            return new Respuestas(400, "El nombre de usuario y la contraseña son obligatorios", null);
        }
        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                return new Respuestas(200, "Usuario encontrado", u);
            }
        }
        return new Respuestas(404, "Usuario no encontrado", null);
    }


    /**
     * Update user respuestas.
     *
     * @param user the user
     * @return the respuestas
     */
    public Respuestas updateUser(User user) {
        if (user == null) {
            return new Respuestas(400, "No se proporcionó un usuario válido", null);
        }
        if (user.getName() == null || user.getPassword() == null) {
            return new Respuestas(400, "El nombre de usuario y la contraseña son obligatorios", null);
        }

        for (User u : users) {
            if (u.getName().equals(user.getName())) {
                return new Respuestas(409, "El nombre de usuario ya existe, por favor elija otro", null);
            }
        }

        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                if (user.getPassword().length() < 6) {
                    return new Respuestas(403, "La contraseña debe tener al menos 6 caracteres", null);
                }

                try {
                    u.setName(user.getName());
                    u.setPassword(user.getPassword());
                    return new Respuestas(200, "Usuario actualizado con éxito", u);
                } catch (Exception e) {
                    return new Respuestas(500, "Error interno del servidor al actualizar el usuario", null);
                }
            }
        }

        return new Respuestas(404, "Usuario no encontrado", null);
    }

    /* Antiguo
    public Respuestas deleteUser(User user) {
        if (user == null) {
            return new Respuestas(400, "No se proporcionó un usuario válido", null);
        }
        if (user.getName() == null || user.getPassword() == null) {
            return new Respuestas(400, "El nombre de usuario y la contraseña son obligatorios", null);
        }
        for (User u : users) {
            if (u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword())) {
                try {
                    users.remove(u);
                    return new Respuestas(200, "Usuario eliminado con éxito", null);
                } catch (Exception e) {
                    return new Respuestas(500, "Error interno del servidor al eliminar el usuario", null);
                }
            }
        }
        return new Respuestas(404, "Usuario no encontrado", null);
    }
    */

    public User findUser(String nombre) {
        for (User u : users) {
            if (u.getName().equals(nombre)) {
                return u;
            }
        }
        return null;
    }

    public void delUser(String nombre) {
        users.remove(findUser(nombre));
    }

    public void delUser(User user) {
        users.remove(user);
    }

    public User createUser(User user) {
        users.add(user);
        return user;
    }

}