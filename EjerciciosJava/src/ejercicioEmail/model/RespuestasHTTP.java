package ejercicioEmail.model;

public class RespuestasHTTP {

    private int status;
    private String body;

    private UserEmail mensajeRespuesta;

    public RespuestasHTTP(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public RespuestasHTTP(int status, String body, UserEmail mensajeRespuesta) {
        this.status = status;
        this.body = body;
        this.mensajeRespuesta = mensajeRespuesta;
    }

    public int getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }

    public UserEmail getMensajeRespuesta() {
        return mensajeRespuesta;
    }

}
