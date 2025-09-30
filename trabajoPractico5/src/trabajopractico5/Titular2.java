
package trabajopractico5;


public class Titular2 {
    private String nombre;
    private int dni;
    private CuentaBancaria cuenta;

    public Titular2(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
       
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    
    
}
