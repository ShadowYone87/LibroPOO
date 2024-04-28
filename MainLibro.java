// Se importa la libreria Scanner
import java.util.Scanner;
public class MainLibro {
    public static void main(String[] args) {
        // Se crea el método para cargar un libro pidiendo los datos al usuario
        // Se llama al metodo Scanner
        Scanner opc = new Scanner(System.in);
        // Se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingrese el ISBN del libro:");
        // Se almacena el valor del usuario
        String ISBN = opc.nextLine();
        // Se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingrese el título del libro:");
        // Se almacena el valor del usuario
        String titulo = opc.nextLine();
        // Se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingrese el autor del libro:");
        // Se almacena el valor del usuario
        String autor = opc.nextLine();
        // Se ingresa el mensaje que se le dara al usuario
        System.out.println("Ingrese el número de páginas del libro:");
        // Se almacena el valor del usuario
        int numPaginas = opc.nextInt();
        //Se crea el objeto
        Libro l1 = new Libro();
        // Se imprime la infotmacion del libro y se muestra en pantalla
        System.out.println("Información del libro ingresado:");
        l1.informarLibro();
        l1.ISBN = ISBN;
        l1.titulo = titulo;
        l1.autor = autor;
        l1.numPaginas = numPaginas;
        l1.ISBN = "";
        l1.titulo = "";
        l1.autor = "";
        l1.numPaginas = 0;
    }
}    