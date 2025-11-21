package Parte2EjerciciosExcepciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaDeArchivos {

    private static Object archivo;

    /**
     * Lee un archivo de texto y muestra su contenido.
     * Maneja FileNotFoundException si el archivo no existe.
     * @param nombreArchivo El nombre o ruta del archivo a leer.
     */
    public static void leerYMostrarArchivo(String nombreArchivo) {
        
        // El bloque try encierra el código que puede lanzar una excepción.
        try {
            // 1. Crear un objeto File que apunta al archivo.
            File archivo = new File(nombreArchivo);
            
            // 2. Crear un objeto Scanner para leer línea por línea.
            // Si el archivo no existe en la ruta especificada, esta línea
            // lanzará la FileNotFoundException.
            Scanner scanner = new Scanner(archivo);
            
            System.out.println("--- Contenido de '" + nombreArchivo + "' ---");
            
            // 3. Iterar sobre el archivo y mostrar el contenido.
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            
            // 4. Cierre del recurso Scanner. (Aunque en este ejercicio 
            // no usamos try-with-resources, es una buena práctica cerrar explícitamente).
            scanner.close();
            System.out.println("----------------------------------------");
            
        } catch (FileNotFoundException e) {
            // El bloque catch captura y maneja la excepción.
            System.err.println("❌ ¡ERROR! No se pudo encontrar el archivo '" + nombreArchivo + "'.");
            System.err.println("Verifica que el archivo esté en la carpeta correcta.");
            // e.getMessage() daría la ruta del archivo que no se encontró
        }
    }

    public static void main(String[] args) {
        // Prueba 1: Lectura exitosa de tu archivo
        leerYMostrarArchivo("archivo.txt"); 
        
        // Prueba 2: Lectura con error para verificar el manejo de la excepción
        leerYMostrarArchivo("inexistente.txt");
    }
}

