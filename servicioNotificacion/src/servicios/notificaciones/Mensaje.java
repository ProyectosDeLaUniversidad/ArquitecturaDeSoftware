package servicios.notificaciones;

public class Mensaje {

    String numeroMovil;
    String buzon;
    Usuario usuario;
    String asunto;
    String mensaje;


    public Mensaje(String numeroMovil, String mensaje) {
        this.numeroMovil = numeroMovil;
        this.mensaje = mensaje;
    }


    public Mensaje(String buzon, String asunto, String mensaje) {
        this.buzon = buzon;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }


    public Mensaje(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

}
