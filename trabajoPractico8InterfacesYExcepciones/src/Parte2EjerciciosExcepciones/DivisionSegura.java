
package Parte2EjerciciosExcepciones;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
         try {
            System.out.print("Ingrese el dividendo: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el divisor: ");
            int b = scanner.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    
    
    }
    
}
