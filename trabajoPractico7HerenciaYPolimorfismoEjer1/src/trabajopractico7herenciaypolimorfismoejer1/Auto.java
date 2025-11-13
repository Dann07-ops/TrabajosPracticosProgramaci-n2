
package trabajopractico7herenciaypolimorfismoejer1;


public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    // Constructor de la subclase
    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Llama al constructor de la clase base (Vehiculo)
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + ", Marca: " + this.marca + ", Cantidad de puertas: " + cantidadPuertas);
         
    }
    
    
    

    
    
}
