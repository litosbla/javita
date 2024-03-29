import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tienda {
    private static Scanner leer = new Scanner(System.in);
    private static List<Pelicula> peliculas = new ArrayList<>();
    private static List<cliente> clientes = new ArrayList<>(); 
    public static void main(String[] args) {
        
        menu();
    
        
    }
    private static void menu(){
        
        System.out.println("*************************");
        System.out.println("       MENU");
        System.out.println("1. Crear Pelicula");
        System.out.println("2. Crear Cliente");
        System.out.println("3. Alquilar Pelicula");
        System.out.println("4. Mostrar informacion");
        System.out.println("5. Modificar informacion");
        System.out.println("6. Eliminar pelicula");
        System.out.println("7. Salir");
        System.out.println("");
        System.out.println("Digite el numero de la opcion que desea realizar: ");
        boolean condition = true;
        int opcion;
        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                crearPelicula(peliculas);
                break;
            case 2:
                crearCliente(clientes);
                break;
            case 3:

                // alquilarPelicula(alquileres, peliculas, clientes);
                break;
            case 4:
                System.out.println("Informacion de las peliculas: ");
                for (Pelicula pelicula : peliculas) {
                    pelicula.mostrarPelicula();
                }
                System.out.println("Informacion de los clientes: ");
                for (cliente cliente : clientes) {
                    cliente.mostrarCliente();
                }
                // System.out.println("Informacion de los alquileres: ");
                // for (alquiler alquiler : alquileres) {
                //     alquiler.display();
                // }
                break;
            case 7:
                condition = false;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
    public static void crearPelicula(List<Pelicula> peliculas){

        System.out.println("Ingrese el id de la pelicula: ");
        int id_pelicula = leer.nextInt();
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo_pelicula = leer.next();
        System.out.println("Ingrese el genero de la pelicula: ");
        String genero_pelicula = leer.next();
        System.out.println("Ingrese el precio de alquiler de la pelicula: ");
        double precioAlquiler_pelicula = leer.nextDouble();
        System.out.println("Ingrese el director de la pelicula: ");
        String director_pelicula = leer.next();
        System.out.println("Ingrese el descuento de la pelicula: ");
        double descuento_pelicula = leer.nextDouble();
        Pelicula pelicula = new Pelicula(id_pelicula, titulo_pelicula, genero_pelicula, precioAlquiler_pelicula, director_pelicula, descuento_pelicula);
        peliculas.add(pelicula);
        menu();

    }
    
    private static void crearCliente(List<cliente> clientes){

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre_cliente = leer.next();
        System.out.println("Ingrese el email del cliente: ");
        String email_cliente = leer.next();
        System.out.println("Ingrese el celular del cliente: ");
        String celular_cliente = leer.next();
        cliente cliente = new cliente(nombre_cliente, email_cliente, celular_cliente);
        clientes.add(cliente);

    }
    
    // public static void alquilarPelicula(List<alquiler> alquileres,){
    //     Scanner leer = new Scanner(System.in);
    //     System.out.println("Ingrese la fecha de inicio del alquiler: ");
    //     String fechainicio_alquiler = leer.next();
    //     System.out.println("Ingrese la fecha de entrega del alquiler: ");
    //     String fechaentrega_alquiler = leer.next();
    //     System.out.println("Ingrese el id del alquiler: ");
    //     int id_alquiler = leer.nextInt();
    //     System.out.println("Ingrese el id de la pelicula: ");
    //     int id_pelicula = leer.nextInt();
    //     alquiler alquiler = new alquiler(fechainicio_alquiler, fechaentrega_alquiler, id_alquiler, peliculas, clientes);
    //     alquileres.add(alquiler);
    //     leer.close();
    // }
  
    
}
