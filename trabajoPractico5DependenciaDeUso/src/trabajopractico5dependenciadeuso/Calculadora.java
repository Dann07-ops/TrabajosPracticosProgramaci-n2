
package trabajopractico5dependenciadeuso;


public class Calculadora {
    public void calcular (Impuesto impuesto){
        System.out.println("Calculando impuesto de $: " + impuesto.getMonto() 
                + "  para el contribuyente: "  + impuesto.getContribuyente().getNombre());
               
    }
}
