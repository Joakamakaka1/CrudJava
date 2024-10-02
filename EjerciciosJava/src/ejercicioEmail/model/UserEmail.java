package ejercicioEmail.model;

import java.util.Objects;

/**
 * The type User email.
 */
public class UserEmail {

    private String nombre;
    private String email;

    /**
     * Instantiates a new User email.
     *
     * @param nombre the nombre
     * @param email  the email
     */
    public UserEmail(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEmail userEmail = (UserEmail) o;

        return Objects.equals(email, userEmail.email);
    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserEmail{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
