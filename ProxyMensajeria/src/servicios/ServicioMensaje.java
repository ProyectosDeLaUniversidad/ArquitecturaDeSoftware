package servicios;

public class ServicioMensaje implements IServicoMensaje{

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando mensaje a: "+ destinatario);
        System.out.println("Mensaje: "+mensaje);
    }
    
}
