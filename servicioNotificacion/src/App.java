import servicios.notificaciones.Canal;
import servicios.notificaciones.INotificacion;
import servicios.notificaciones.Mensaje;
import servicios.notificaciones.NotificacionFactory;

public class App {
    public static void main(String[] args) throws Exception {
        NotificacionFactory notificacionFactory = new NotificacionFactory();

        INotificacion notificacion = notificacionFactory.crearNotificacion(Canal.CORREO);

        Mensaje mensaje=new Mensaje("rosamelano@gmail.com","Te extraño","Saludo");

        notificacion.notificar(mensaje);
    }
}

