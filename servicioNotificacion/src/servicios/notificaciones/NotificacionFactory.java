package servicios.notificaciones;

public class NotificacionFactory {

    public INotificacion crearNotificacion(Canal canal)
    {
        switch (canal) {
            case SMS:
                return new NotificacionSms();
            case CORREO:
                return new NotificacionCorreo();
            case INSERCION:
                return new NotificacionInsercion();
            case WhatsApp:
                return new NotificacionWhatsApp();    
        }
        return null;
    }    
    
}
