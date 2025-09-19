
package trabajopractico4;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados=0;
 //Constructores:   
public Empleado(int id, String nombre, String puesto, double salario){
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto; 
    this.salario = salario;
    totalEmpleados++;
 }    
public Empleado(String nombre, String puesto){
    this.id= ++totalEmpleados;
    this.nombre= nombre;
    this.puesto = puesto;
    this.salario = 50000.0;
}

//Metodo sobrecargado
public void actualizarSalario(double porcentaje){
    this.salario += this.salario * (porcentaje/100); 
}
public void actualizarSalario(int aumentoFijo){
    this.salario += aumentoFijo;
}    
    
@Override 
public String toString(){
   return "ID:" + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario:  $" + salario;  
}
 
//metodo estatico

public static int mostrarTotalEmpleados(){
    return totalEmpleados;
}
//Metodos Getters y Setters
public int getId() { return id; }
public String getNombre() { return nombre; }
public String getPuesto() { return puesto; }
public double getSalario() { return salario; }

public void setNombre(String nombre) { this.nombre = nombre; }
public void setPuesto(String puesto) { this.puesto = puesto; }
public void setSalario(double salario) { this.salario = salario; }


}
