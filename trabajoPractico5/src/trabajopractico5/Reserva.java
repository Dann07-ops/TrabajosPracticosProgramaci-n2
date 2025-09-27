
package trabajopractico5;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente2 cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente2 cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente2 getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    
    
}
