public class cliente {

    private String nombre;
    private String email;
    private String celular;

    public cliente(String nombre, String email, String celular){
        this.nombre=nombre;
        this.email=email;
        this.celular=celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    public void mostrarCliente(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Email: "+email);
        System.out.println("Celular: "+celular);
    }
}
