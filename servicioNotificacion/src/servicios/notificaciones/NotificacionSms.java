package servicios.notificaciones;

public class NotificacionSms implements INotificacion {



    @Override
    public void notificar(Mensaje mensaje) {
        System.out.println(String.format("Enviado el mensaje por SMS [%s] al numero [%s]", mensaje.mensaje, mensaje.numeroMovil));
    }

   
    
}
