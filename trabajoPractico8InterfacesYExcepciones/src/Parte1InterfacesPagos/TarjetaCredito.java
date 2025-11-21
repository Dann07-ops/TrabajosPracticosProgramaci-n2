
package Parte1InterfacesPagos;


import Parte1Interfaces.pagoConDescuento;

public class TarjetaCredito implements pagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.9; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta procesado: $" + monto);
    }
}
