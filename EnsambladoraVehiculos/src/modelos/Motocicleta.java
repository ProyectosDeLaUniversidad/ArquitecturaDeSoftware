package modelos;

public class Motocicleta extends Vehiculo{

    public Motocicleta(Etapa ensambleChasis, Etapa ensambleCarroceria, Etapa pintura) {
        super(ensambleChasis, ensambleCarroceria, pintura);
    }

    @Override
    public void fabricar() {
        System.out.println("Fabricacion MOTOCICLETA:");
        ensambleChasis.ejecutar();
        ensambleCarroceria.ejecutar();
        pintura.ejecutar();
    }

}
