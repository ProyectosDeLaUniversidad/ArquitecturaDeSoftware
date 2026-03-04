import entidades.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario1= new Usuario.UsuarioBuilder("Huber", "Arroyave")
        .buildCorreo("huber123@gmail.com")
        .build();

        Usuario usuario2= new Usuario.UsuarioBuilder("Omar", "Torres")
        .buildEdad(25)
        .buildTelefono("3005784967")
        .build();

        Usuario usuario3= new Usuario.UsuarioBuilder("Jhon", "Botero")
        .buildDireccion("cra 36 # 77-19")
        .buildCorreo("jhon123@gmail.com")
        .build();

        Usuario usuario4= new Usuario.UsuarioBuilder("Juan", "Muñoz")
        .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);
 
    }
}
