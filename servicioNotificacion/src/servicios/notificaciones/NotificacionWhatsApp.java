package servicios.notificaciones;

public class NotificacionWhatsApp implements INotificacion{

    @Override
    public void notificar(Mensaje mensaje) {
        
        System.out.println(String.format("Enviado el mensaje por WhatsApp [%s] al numero [%s]", mensaje.mensaje, mensaje.numeroMovil));
    }
}
