package modelos;

public class Pintura implements Etapa{

    @Override
    public void ejecutar() {
        System.out.println("La pintura ha sido ejecutada");
    }

}
