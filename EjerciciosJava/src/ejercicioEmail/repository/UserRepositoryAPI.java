package ejercicioEmail.repository;

import ejercicioEmail.model.UserEmail;

/**
 * The interface User repository api.
 */
public interface UserRepositoryAPI {

    /**
     * Gets user email.
     *
     * @param email the email
     * @return the user email
     */
    UserEmail getUserEmail(String email);

    /**
     * Insert user email user email.
     *
     * @param userEmail the user email
     * @return the user email
     */
    UserEmail insertUserEmail(String nombre, String email);

    /**
     * Delete user email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    boolean deleteUserEmail(String email);
}
