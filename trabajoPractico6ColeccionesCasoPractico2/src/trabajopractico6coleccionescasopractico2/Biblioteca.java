
package trabajopractico6coleccionescasopractico2;

import java.util.*;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equalsIgnoreCase(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        Set<String> autoresUnicos = new HashSet<>();
        for (Libro l : libros) {
            Autor a = l.getAutor();
            if (autoresUnicos.add(a.getId())) {
                a.mostrarInfo();
            }
        }
    }
}

