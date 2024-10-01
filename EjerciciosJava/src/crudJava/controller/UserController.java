package crudJava.controller;

import crudJava.clases.Respuestas;
import crudJava.service.UserService;

public class UserController {
    private final UserService us;
    public UserController() {
        us = new UserService();
    }
    public Respuestas deleteUser(String nombre) {
        try {
            return us.deleteUser(nombre) ?
                    new Respuestas(200, "Usuario eliminado con exito", null) :
                    new Respuestas(400, "Bad request", null);
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null);
        }
    }

    public Respuestas searchUser(String nombre) {
        try{
            return us.getUser(nombre) == null ?
                    new Respuestas(200, "Usuario encontrado con exito", null) :
                    new Respuestas(400, "Bad request", null);
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null);
        }
    }

    public Respuestas createUser(String nombre, String password) {
        try {
            return us.createUser(nombre, password) != null ?
                    new Respuestas(200, "Usuario creado con exito", null) :
                    new Respuestas(400, "Bad request", null);
        } catch (Exception e) {
            return new Respuestas(500, "Error interno del servidor", null);
        }
    }
}
