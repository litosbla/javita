import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class tienda {
    public static void crearPelicula(List<Pelicula> peliculas){
            Scanner leer = new Scanner(System.in);
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
            int descuento_pelicula = leer.nextInt();
            Pelicula pelicula = new Pelicula(id_pelicula, titulo_pelicula, genero_pelicula, precioAlquiler_pelicula, director_pelicula, descuento_pelicula);
            leer.close();
        }
    public static void crearCliente(List<cliente> clientes){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre_cliente = leer.next();
            System.out.println("Ingrese el email del cliente: ");
            String email_cliente = leer.next();
            System.out.println("Ingrese el celular del cliente: ");
            String celular_cliente = leer.next();
            cliente cliente = new cliente(nombre_cliente, email_cliente, celular_cliente);
            leer.close();
        }
    public static void alquilarPelicula(List<alquiler> alquileres, List<Pelicula> peliculas, List<cliente> clientes){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el id del alquiler: ");
            int id_alquiler = leer.nextInt();
            System.out.println("Ingrese la fecha de inicio del alquiler: ");
            String fechainicio_alquiler = leer.next();
            System.out.println("Ingrese la fecha de entrega del alquiler: ");
            String fechaentrega_alquiler = leer.next();
            System.out.println("Ingrese el id de la pelicula: ");
            int id_pelicula = leer.nextInt();
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre_cliente = leer.next();
            alquiler alquiler = new alquiler(fechainicio_alquiler, fechaentrega_alquiler, id_alquiler, peliculas, clientes);
            leer.close();
        }
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        List<cliente> clientes = new ArrayList<>(); 
        List<alquiler> alquileres = new ArrayList<>();
        boolean condition = true;
        Scanner leer = new Scanner(System.in);
        int opcion;

        while (condition) {
            System.out.println("*************************");
            System.out.println("       MENU");
            System.out.println("1. Crear Pelicula");
            System.out.println("2. Crear Cliente");
            System.out.println("3. Alquilar Pelicula");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Digite el numero de la opcion que desea realizar: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
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
                    int descuento_pelicula = leer.nextInt();
                    Pelicula pelicula = new Pelicula(int id, String titulo, String genero, double precioAlquiler, String director, int descuento);
                    break;
                case 2:
                    cliente cliente = new cliente();
                    break;
                case 3:
                    alquiler alquiler = new alquiler();
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        }
        
    }
    
}

