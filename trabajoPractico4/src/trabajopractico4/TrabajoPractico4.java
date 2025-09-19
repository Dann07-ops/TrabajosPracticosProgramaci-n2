
package trabajopractico4;


public class TrabajoPractico4 {

   
    public static void main(String[] args) {
        // Creacion de empleados
        Empleado empleado1 = new Empleado(101, "Manuel Torres", "Analista", 80000.0);
        Empleado empleado2 = new Empleado(102,"Maria Vega", "Programador", 100000.0);
        
        Empleado empleado3 = new Empleado("Sergio Peralta", "Tester");
        Empleado empleado4 = new Empleado("Laura Gomez", "Soporte");
        
        // Informacion inicial
        System.out.println("Empleados: ");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3); 
        System.out.println(empleado4);
        
        empleado1.actualizarSalario(10); //Aumento porcentaje
        empleado2.actualizarSalario(2000); //Aumento fijo 
        empleado3.actualizarSalario(15); //Aumento porcentaje
        empleado4.actualizarSalario(4000); //Aumento fijo
       
        // Informacion actualizada
        System.out.println("Empleados con la actualizacion de sueldo: ");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3); 
        System.out.println(empleado4);
        
        //Total de empleados
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        
    }
    
}
