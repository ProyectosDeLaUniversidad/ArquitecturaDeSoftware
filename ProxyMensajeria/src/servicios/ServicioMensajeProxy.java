package servicios;

import java.util.ArrayList;
import java.util.List;

public class ServicioMensajeProxy implements IServicoMensaje{

    private IServicoMensaje servicio;
    private List<String> prohibidos= new ArrayList();
    
    public ServicioMensajeProxy(){
        this.servicio = new ServicioMensaje();
        prohibidos.add("frayosorio@gmail.com");
    }

    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        if(!prohibidos.contains(destinatario)){
            servicio.enviarMensaje(destinatario, mensaje);
        }
        else{
            System.out.println("El destinatario no es permitido");
        }
        
    }

}
