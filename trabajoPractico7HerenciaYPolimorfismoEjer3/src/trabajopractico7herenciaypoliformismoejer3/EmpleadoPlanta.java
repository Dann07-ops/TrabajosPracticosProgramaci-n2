
package trabajopractico7herenciaypoliformismoejer3;


public class EmpleadoPlanta extends Empleado {
    
    private double sueldoBase;

    public EmpleadoPlanta(double sueldoBase, String nombre) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo(){
        return sueldoBase;
        
    
    }
        
    
    
    
}
