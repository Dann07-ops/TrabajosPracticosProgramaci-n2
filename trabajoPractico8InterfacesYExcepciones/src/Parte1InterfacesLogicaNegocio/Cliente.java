
package Parte1InterfacesLogicaNegocio;

import Parte1Interfaces.Notificable;
public class Cliente implements Notificable{
    private String nombre;
    
    public Cliente(String nombre){
      this.nombre = nombre;
    
    }

    
    
    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Hola " + nombre + ", tu pedido cambió a: " + nuevoEstado);
    }
    
}
