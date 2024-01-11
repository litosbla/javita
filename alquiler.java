
import java.time.LocalDateTime;


public class alquiler{
    private LocalDateTime fechainicio;
    private LocalDateTime fechaentrega;
    private int id;
    private Pelicula peliculas;
    private cliente clientes;
    


    public alquiler(LocalDateTime fechainicio, LocalDateTime fechaentrega, int id, Pelicula peliculas,
            cliente clientes) {
        this.fechainicio = fechainicio;
        this.fechaentrega = fechaentrega;
        this.id = id;
        this.peliculas = peliculas;
        this.clientes = clientes;
    }



    public LocalDateTime getFechainicio() {
        return fechainicio;
    }



    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }



    public LocalDateTime getFechaentrega() {
        return fechaentrega;
    }



    public void setFechaentrega(LocalDateTime fechaentrega) {
        this.fechaentrega = fechaentrega;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public Pelicula getPeliculas() {
        return peliculas;
    }



    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }



    public cliente getClientes() {
        return clientes;
    }



    public void setClientes(cliente clientes) {
        this.clientes = clientes;
    }

    public void display(){
        System.out.println("Información del Alquiler:");
        System.out.println("Fecha de inicio: " + this.fechainicio);
        System.out.println("Fecha de entrega: " + this.fechaentrega);
        System.out.println("Id: " + this.id);
        System.out.println("Pelicula: " + this.peliculas);
        System.out.println("Cliente: " + this.clientes);
    }
   

   
}
