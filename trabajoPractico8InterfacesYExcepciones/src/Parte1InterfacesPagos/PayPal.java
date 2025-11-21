
package Parte1InterfacesPagos;

import Parte1Interfaces.Pago;


public class PayPal implements Pago {
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado: $" + monto);
    }
    
    
}
