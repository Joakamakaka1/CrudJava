package crudJava.clases;

/**
 * The type User.
 */
public class User {

    private String name;
    private String password;

    /**
     * Instantiates a new User.
     *
     * @param name     the name
     * @param password the password
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
