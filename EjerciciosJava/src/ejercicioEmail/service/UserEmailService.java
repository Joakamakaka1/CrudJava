package ejercicioEmail.service;

import ejercicioEmail.model.UserEmail;
import ejercicioEmail.repository.UserEmailRepository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type User email service.
 */
public class UserEmailService {

    private UserEmailRepository repository;

    /**
     * Instantiates a new User email service.
     */
    public UserEmailService() {
        this.repository = new UserEmailRepository();
    }

    /**
     * Gets user email.
     *
     * @param email the email
     * @return the user email
     */
    public UserEmail getUserEmail(String email) {
        if (email == null || email.isEmpty()) {
            return null;
        }

        UserEmail u = repository.getUserEmail(email);
        return u;
    }

    /**
     * Insert user email user email.
     *
     * @param nombre the nombre
     * @param email  the email
     * @return the user email
     */
    public UserEmail insertUserEmail(String nombre, String email) {
        if (email == null || email.trim().isEmpty()) {
            return null;
        }

        if (nombre == null || nombre.trim().isEmpty()) {
            return null;
        }

        if (nombre.length() > 15) {
            return null;
        }

        String regexNombre = "[a-zA-Z0-9]{1,15}$";
        Pattern p = Pattern.compile(regexNombre, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(nombre);
        if (!m.matches()) {
            return null;
        }

        String regexEmail = "^[\\w-]+@\\w+\\.(com|es)$";
        p = Pattern.compile(regexEmail);
        m = p.matcher(email);
        if (!m.matches()) {
            return null;
        }

        return repository.insertUserEmail(nombre, email);
    }

    /**
     * Delete user email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    public boolean deleteUserEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        return repository.deleteUserEmail(email);
    }
}
