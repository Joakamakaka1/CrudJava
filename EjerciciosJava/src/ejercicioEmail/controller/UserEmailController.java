package ejercicioEmail.controller;

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
                    new RespuestasHTTP(200, "Usuario encontrado: " + u.toString()) :
                    new RespuestasHTTP(404, "Usuario con el email '" + email + "' no encontrado.");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor: " + e.getMessage());
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
            if (service.getUserEmail(nombre) != null || service.getUserEmail(email) != null) {
                return new RespuestasHTTP(409, "El usuario con el email '" + email + "' ya existe.");
            }
            UserEmail u2 = service.insertUserEmail(nombre, email);
            return u2 != null ?
                    new RespuestasHTTP(201, "Usuario insertado: " + u2.toString()) :
                    new RespuestasHTTP(404, "Error al insertar el usuario. Verifique los datos.");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor: " + e.getMessage());
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
                return new RespuestasHTTP(404, "Usuario con el email '" + email + "' no encontrado.");
            }
            return service.deleteUserEmail(email) ?
                    new RespuestasHTTP(200, "Usuario con el email '" + email + "' eliminado exitosamente.") :
                    new RespuestasHTTP(400, "Error al eliminar el usuario con el email '" + email + "'.");
        } catch (Exception e) {
            return new RespuestasHTTP(500, "Error interno del servidor: " + e.getMessage());
        }
    }
}