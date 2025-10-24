
package trabajopractico6coleccionescasopractico2;


public class TrabajoPractico6ColeccionesCasoPractico2 {

    
    public static void main(String[] args) {
      // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A003", "Gabriel García Márquez", "Colombia");

        // 3. Agregar libros
        biblioteca.agregarLibro("L001", "Ficciones", 1944, a1);
        biblioteca.agregarLibro("L002", "El Aleph", 1949, a1);
        biblioteca.agregarLibro("L003", "La casa de los espíritus", 1982, a2);
        biblioteca.agregarLibro("L004", "Cien años de soledad", 1967, a3);
        biblioteca.agregarLibro("L005", "Crónica de una muerte anunciada", 1981, a3);

        // 4. Listar todos los libros
        System.out.println("Todos los libros:");
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("Buscar libro por ISBN 'L003':");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar libros por año
        System.out.println("Libros publicados en 1981:");
        biblioteca.filtrarLibrosPorAnio(1981);

        // 7. Eliminar libro por ISBN
        System.out.println("Eliminando libro 'L002'...");
        biblioteca.eliminarLibro("L002");
        System.out.println("Libros restantes:");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total de libros
        System.out.println("Total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        System.out.println("Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();
    }
    
    
}
