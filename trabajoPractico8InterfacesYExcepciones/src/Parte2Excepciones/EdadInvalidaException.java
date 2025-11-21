
package Parte2Excepciones;


public class EdadInvalidaException extends Exception { 
    
    /**
     * Constructor para la excepción de edad.
     * @param mensaje El mensaje de error que explica por qué la edad es inválida.
     */
    public EdadInvalidaException(String mensaje) {
        // Llama al constructor de la clase base (Exception) para almacenar el mensaje.
        super(mensaje); 
    }
}