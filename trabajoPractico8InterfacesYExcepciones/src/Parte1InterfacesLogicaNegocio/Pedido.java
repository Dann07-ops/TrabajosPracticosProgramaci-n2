
package Parte1InterfacesLogicaNegocio;

import Parte1InterfacesLogicaNegocio.Cliente;
import Parte1Interfaces.Pagable;
import java.util.List;

public class Pedido implements Pagable {
    
private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(List<Producto> productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioEstado(nuevoEstado);
    }

    public String getEstado() { return estado; }
    
}
