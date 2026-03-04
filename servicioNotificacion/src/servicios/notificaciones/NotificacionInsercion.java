package servicios.notificaciones;

public class NotificacionInsercion implements INotificacion{
    
    @Override
    public void notificar(Mensaje mensaje) {
        System.out.println(String.format("Enviado el mensaje por SMS [%s] al usuario [%s]",mensaje.mensaje, mensaje.usuario));
    }

}
