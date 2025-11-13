
package trabajopractico7herenciaypoliformismoejer4;

public class Animal {
    
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public String hacerSonido(){
        
        return "Sonido generico";
        
    }
    
    public String describirAnimal(){
        return "Este animal se llama " + nombre;
    } 

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
