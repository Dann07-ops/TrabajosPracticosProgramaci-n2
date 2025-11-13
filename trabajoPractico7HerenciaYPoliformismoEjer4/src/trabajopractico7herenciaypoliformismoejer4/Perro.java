
package trabajopractico7herenciaypoliformismoejer4;

public class Perro extends Animal{
    
    public Perro (String nombre){
    super(nombre);
       
    }

    @Override
    public String hacerSonido() {
        return "Guaf!! "; 
    }
    
    
    
    
    
}
