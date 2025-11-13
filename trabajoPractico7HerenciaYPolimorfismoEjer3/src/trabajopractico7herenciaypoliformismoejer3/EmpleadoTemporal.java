
package trabajopractico7herenciaypoliformismoejer3;


public class EmpleadoTemporal extends Empleado{
    
    private int horasTrabajadas;
    private double valorHoras;

    public EmpleadoTemporal(int horasTrabajadas, double valorHoras, String nombre) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoras = valorHoras;
    }

    @Override
    public double calcularSueldo(){
        return horasTrabajadas * valorHoras;
    }
    
    
    
}
