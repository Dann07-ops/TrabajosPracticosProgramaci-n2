
package trabajopractico7herenciaypoliformismoejer4;

import java.util.ArrayList;
public class TrabajoPractico7HerenciaYPoliformismoEjer4 {

  
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Tito"));
        animales.add(new Gato("Juan Carlos"));
        animales.add(new Vaca ("Mina"));
        
        
        for (Animal a : animales) {
            System.out.println(a.describirAnimal());
            System.out.println("Sonido: " + a.hacerSonido());
            System.out.println("---------------------------");
        }
    
    }
    
}
