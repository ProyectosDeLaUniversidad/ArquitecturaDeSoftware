import servicios.IServicoMensaje;
import servicios.ServicioMensajeProxy;

public class App {
    public static void main(String[] args) throws Exception {
        IServicoMensaje sm=new ServicioMensajeProxy();
        sm.enviarMensaje("frayosorio@gmail.com", "hola");
        sm.enviarMensaje("huber@gmail.com", "hola");
    }
}
