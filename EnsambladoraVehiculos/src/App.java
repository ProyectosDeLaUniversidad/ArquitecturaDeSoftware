import modelos.Automovil;
import modelos.EnsambleCarroceria;
import modelos.EnsambleChasis;
import modelos.Motocicleta;
import modelos.Pintura;
import modelos.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo moto1= new Motocicleta(new EnsambleChasis(),new EnsambleCarroceria(), new Pintura());
        moto1.fabricar();

        Vehiculo carro1= new Automovil(new EnsambleChasis(),new EnsambleCarroceria(), new Pintura());
        carro1.fabricar();
    }
}
