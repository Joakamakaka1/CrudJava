package ejercicioEmail.controller;

import crudJava.clases.Respuestas;
import ejercicioEmail.model.RespuestasHTTP;
import ejercicioEmail.model.UserEmail;
import ejercicioEmail.service.UserEmailService;

/**
 * The type User email controller.
 */
public class UserEmailController {

    private final UserEmailService service;

    /**
     * Instantiates a new User email controller.
     */
    public UserEmailController() {
        this.service = new UserEmailService();
    }

    /**
     * Gets user email.
     *
     * @param email the email
     * @return the user email
     */
    public RespuestasHTTP getUserEmail(String email) {
        try {
            UserEmail u = service.getUserEmail(email);
            return u != null ?
                    new RespuestasHTTP(200, "Usuario encontrado") :
                    new RespuestasHTTP(404, "Usuario no encontrado");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor");
        }
    }

    /**
     * Insert user email respuestas http.
     *
     * @param nombre the nombre
     * @param email  the email
     * @return the respuestas http
     */
    public RespuestasHTTP insertUserEmail(String nombre, String email) {
        try {
            UserEmail u2 = service.insertUserEmail(nombre, email);
            if(service.getUserEmail(nombre) != null || service.getUserEmail(email) != null) {
                return new RespuestasHTTP(409, "El usuario ya existe");
            }
            return u2 != null ?
                    new RespuestasHTTP(201, "Usuario insertado") :
                    new RespuestasHTTP(404, "Usuario no insertado");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor");
        }
    }

    /**
     * Delete user email respuestas http.
     *
     * @param email the email
     * @return the respuestas http
     */
    public RespuestasHTTP deleteUserEmail(String email) {
        try {
            if (service.getUserEmail(email) == null) {
                return new RespuestasHTTP(404, "Usuario no encontrado");
            }
            return service.deleteUserEmail(email) ?
                    new RespuestasHTTP(200, "Usuario eliminado") :
                    new RespuestasHTTP(400, "Error al eliminar el usuario");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor");
        }
    }
}
