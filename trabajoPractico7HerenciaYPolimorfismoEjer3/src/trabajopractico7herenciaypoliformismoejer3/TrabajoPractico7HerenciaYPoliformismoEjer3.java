
package trabajopractico7herenciaypoliformismoejer3;

import java.util.ArrayList;
public class TrabajoPractico7HerenciaYPoliformismoEjer3 {

  
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta(50000, "Ana" ));
        empleados.add(new EmpleadoTemporal(120, 400, "Luis"));
        empleados.add(new EmpleadoPlanta(60000, "Carlos"));
        empleados.add(new EmpleadoTemporal(100, 350, "Sofía"));
        
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Tipo: " + (e instanceof EmpleadoPlanta ? "Planta" : "Temporal"));
            System.out.println("Sueldo: $" + e.calcularSueldo());
            System.out.println("---------------------------");
        }
        
    }
    
}
