package servicios.notificaciones;

public class NotificacionCorreo implements INotificacion{

    @Override
    public void notificar(Mensaje mensaje) {
        System.out.println(String.format("Enviado el mensaje  [%s] al buzon [%s] con asunto [%s]", mensaje.mensaje, mensaje.buzon, mensaje.asunto));

    }
    
}
