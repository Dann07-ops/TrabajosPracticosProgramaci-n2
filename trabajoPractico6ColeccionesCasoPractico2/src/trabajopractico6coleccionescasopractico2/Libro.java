
package trabajopractico6coleccionescasopractico2;


public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo(){
        System.out.println("Titulo. " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de la publicación: " + anioPublicacion);
         if (autor != null) {
            autor.mostrarInfo();
        } else {
            System.out.println("Autor no disponible.");
    }
        System.out.println("-----------------------------");
    }
    
}
