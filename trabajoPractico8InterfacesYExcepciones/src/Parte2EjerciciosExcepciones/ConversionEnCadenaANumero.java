
package Parte2EjerciciosExcepciones;

import java.util.Scanner;
        
public class ConversionEnCadenaANumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        String texto = scanner.nextLine();
        
          try {
            int numero = Integer.parseInt(texto); // Conversión explícita
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: El texto ingresado no es un número válido.");
        }
    
    }
    
}
