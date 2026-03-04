package entidades;

public class Usuario {
    private final String nombres;
    private final String apellidos;
    private final int edad;
    private final String direccion;
    private final String telefono;
    private final String correo;
    
    public Usuario(UsuarioBuilder builder){
        this.nombres=builder.nombres;
        this.apellidos=builder.apellidos;
        this.edad=builder.edad;
        this.direccion=builder.direccion;
        this.telefono=builder.telefono;
        this.correo=builder.correo;
    }

    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString(){
        return "Usuario: "+this.nombres+" "+
        this.apellidos+" "+
        this.edad+" "+
        this.direccion+" "+
        this.telefono+" "+
        this.correo+" ";
    }

    public static class UsuarioBuilder{
        private final String nombres; //requerido
        private final String apellidos; //requerido
        private int edad ; //opcional
        private String direccion; //opcional
        private String telefono; //opcional
        private String correo; //opcional

        public UsuarioBuilder(String nombres, String apellidos){
            this.nombres=nombres;
            this.apellidos=apellidos;
        }

        public UsuarioBuilder buildEdad(int edad){
            this.edad=edad;
            return this;
        }

        public UsuarioBuilder buildDireccion(String direccion){
            this.direccion=direccion;
            return this;
        }

        public UsuarioBuilder buildTelefono(String telefono){
            this.telefono=telefono;
            return this;
        }

        public UsuarioBuilder buildCorreo(String correo){
            this.correo=correo;
            return this;
        }

        public Usuario build(){
            Usuario usuario= new Usuario(this);
            return usuario;
        }

    }


}
