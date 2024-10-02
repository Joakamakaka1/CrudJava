package ejercicioEmail.service;

import ejercicioEmail.model.UserEmail;
import ejercicioEmail.repository.UserEmailRepository;

public class UserEmailService {

    private UserEmailRepository repository;

    public UserEmailService() {
        this.repository = new UserEmailRepository();
    }

    public UserEmail getUserEmail(String email) {
        if (email == null || email.isEmpty()) {
            return null;
        }

        UserEmail u = repository.getUserEmail(email);
        return u;
    }

    public UserEmail insertUserEmail(UserEmail u) {
        if(u == null) {
            return null;
        }

        return repository.insertUserEmail(u);
    }

    public boolean deleteUserEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        return repository.deleteUserEmail(email);
    }
}
