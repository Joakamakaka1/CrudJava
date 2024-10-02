package ejercicioEmail.model;

/**
 * The type Respuestas http.
 */
public class RespuestasHTTP {

    private int status;
    private String body;

    /**
     * Instantiates a new Respuestas http.
     *
     * @param status the status
     * @param body   the body
     */
    public RespuestasHTTP(int status, String body) {
        this.status = status;
        this.body = body;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

}
