public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private double precioAlquiler;
    private String director;
    private double descuento;

  

 
    public Pelicula(int id, String titulo, String genero, double precioAlquiler, String director, double descuento) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.precioAlquiler = precioAlquiler;
        this.director = director;
        this.descuento = descuento;
    }




    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getTitulo() {
        return titulo;
    }




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




    public String getGenero() {
        return genero;
    }




    public void setGenero(String genero) {
        this.genero = genero;
    }




    public double getPrecioAlquiler() {
        return precioAlquiler;
    }




    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }




    public String getDirector() {
        return director;
    }




    public void setDirector(String director) {
        this.director = director;
    }




    public double getDescuento() {
        return descuento;
    }




    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }




    public void mostrarPelicula(){
        System.out.println("Id: "+id);
        System.out.println("Titulo: "+titulo);
        System.out.println("Genero: "+genero);
        System.out.println("Precio de alquiler: "+precioAlquiler);
        System.out.println("Director: "+director);
        System.out.println("Descuento: "+descuento);
    }
    
 
}
