package ejercicioEmail.repository;

import ejercicioEmail.model.UserEmail;

import java.util.ArrayList;

/**
 * The type User email repository.
 */
public class UserEmailRepository implements UserRepositoryAPI {

    /**
     * The User emails.
     */
    ArrayList<UserEmail> userEmails;

    /**
     * Instantiates a new User email repository.
     */
    public UserEmailRepository() {
        this.userEmails = new ArrayList<>();

        userEmails.add(new UserEmail("Javier", "javier@javier"));
        userEmails.add(new UserEmail("Juan", "juan@juan"));
        userEmails.add(new UserEmail("Pedro", "pedro@pedro"));
    }

    @Override
    public UserEmail getUserEmail(String email) {
        //return userEmails.stream().filter(userEmail -> userEmail.getEmail().equals(email)).findFirst().orElse(null);
        UserEmail userReturn = null;

        for(UserEmail u : userEmails) {
            if(u.getEmail().equals(email)) {
                userReturn = u;
                break;
            }
        }
        return userReturn;
    }

    @Override
    public UserEmail insertUserEmail(String nombre, String email) {
        //return userEmails.stream().filter(userEmail -> userEmail.getEmail().equals(email)).findFirst().orElse(null);
        userEmails.add(new UserEmail(nombre, email));
        return getUserEmail(email);
    }

    @Override
    public boolean deleteUserEmail(String email) {
        // return userEmails.removeIf(userEmail -> userEmail.getEmail().equals(email));
        return userEmails.remove(getUserEmail(email));
    }
}
