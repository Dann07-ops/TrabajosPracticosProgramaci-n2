
package trabajopractico5dependenciadecreacion;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
         CodigoQR codigo = new CodigoQR(valor, usuario);
         System.out.println("Código QR generado: " + codigo.getValor());
         System.out.println("Asignado a: " + codigo.getUsuario().getNombre() + " (" + codigo.getUsuario().getEmail() + ")");
    }
}
