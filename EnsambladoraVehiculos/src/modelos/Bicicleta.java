package modelos;

public class Bicicleta extends Vehiculo{

    public Bicicleta(Etapa ensambleChasis, Etapa ensambleCarroceria, Etapa pintura) {
        super(ensambleChasis, ensambleCarroceria, pintura);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricacion BICICLETA:");
        ensambleChasis.ejecutar();
        ensambleCarroceria.ejecutar();
        pintura.ejecutar();
    }

}
