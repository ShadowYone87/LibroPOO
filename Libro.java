public class Libro {
     String ISBN;
     String titulo;
     String autor;
     int numPaginas;
     // Se crea el constructor con todos los atributos pasados por parámetro
     public Libro(String ISBN, String titulo, String autor, int numPaginas){
     }
     // Se crea el constructor vacío
    public Libro() {
    }
    // Se crea el método para informar los datos del libro
    public void informarLibro() {
        // Se llama al objeto
    System.out.println("ISBN: " + this.ISBN);
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Número de páginas: " + this.numPaginas);
    }
}