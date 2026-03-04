package modelos;

public class Automovil extends Vehiculo {

    public Automovil(Etapa ensambleChasis, Etapa ensambleCarroceria, Etapa pintura) {
        super(ensambleChasis, ensambleCarroceria, pintura);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricacion AUTOMOVIL:");
        ensambleChasis.ejecutar();
        ensambleCarroceria.ejecutar();
        pintura.ejecutar();
    }

}
