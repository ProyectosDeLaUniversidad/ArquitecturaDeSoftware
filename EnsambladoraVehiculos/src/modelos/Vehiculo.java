package modelos;

public abstract class Vehiculo {

    Etapa ensambleChasis;
    Etapa ensambleCarroceria;
    Etapa pintura;
    
    public Vehiculo(Etapa ensambleChasis, Etapa ensambleCarroceria, Etapa pintura) {
        this.ensambleChasis = ensambleChasis;
        this.ensambleCarroceria = ensambleCarroceria;
        this.pintura = pintura;
    }

    public abstract void fabricar();


}
