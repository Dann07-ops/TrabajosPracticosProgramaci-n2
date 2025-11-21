
package Parte1Interfaces.main;

import Parte1InterfacesLogicaNegocio.Producto;
import Parte1InterfacesLogicaNegocio.Pedido;
import Parte1InterfacesLogicaNegocio.Cliente;
import Parte1InterfacesPagos.TarjetaCredito;
import Parte1InterfacesPagos.PayPal;

import java.util.Arrays;
import java.util.List;
public class EcommerceMain {

   
    public static void main(String[] args) {
        
        System.out.println("Creando productos...");
        Producto p1 = new Producto("Auriculares", 1500);
        Producto p2 = new Producto("Mouse", 2500);
        Producto p3 = new Producto("Teclado", 4000);
        List<Producto> listaProductos = Arrays.asList(p1, p2, p3);

        System.out.println("Creando cliente...");
        Cliente cliente = new Cliente("Daniel");

        System.out.println("Creando pedido...");
        Pedido pedido = new Pedido(listaProductos, cliente);

        System.out.println("Calculando total del pedido...");
        double totalPedido = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + totalPedido);

        System.out.println("Procesando pago con tarjeta");
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(totalPedido);
        tarjeta.procesarPago(totalConDescuento);
        System.out.println("Pago con tarjeta procesado: $" + totalConDescuento);

        System.out.println("Procesando pago con PayPal...");
        PayPal paypal = new PayPal();
        paypal.procesarPago(totalPedido);
        System.out.println("Pago con PayPal procesado: $" + totalPedido);

        System.out.println("Cambiando estado del pedido...");
        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

        System.out.println("Proceso finalizado.");
       
        
        
        
        
    }
    
}