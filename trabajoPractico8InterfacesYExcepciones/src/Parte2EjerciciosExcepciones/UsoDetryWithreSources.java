
package Parte2EjerciciosExcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsoDetryWithreSources {
    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt"; // Asegurate de que esté en la carpeta correcta

        System.out.println("Intentando leer el archivo con BufferedReader...");

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = br.readLine()) != null) {
                System.out.println("Línea " + numeroLinea + ": " + linea);
                numeroLinea++;
            }

            System.out.println("\nFin del archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            System.out.println("Verificá que el archivo exista y tenga permisos de lectura.");
        }
    }
    
    
}
