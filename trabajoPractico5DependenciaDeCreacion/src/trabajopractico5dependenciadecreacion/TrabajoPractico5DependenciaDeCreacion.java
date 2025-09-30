
package trabajopractico5dependenciadecreacion;


public class TrabajoPractico5DependenciaDeCreacion {

   
    public static void main(String[] args) {
        // Ejercicio 13 
        /**
        Usuario usuario = new Usuario("Daniela Vega", "daniela@gmail");
        GeneradorQR generador = new GeneradorQR();
        
        generador.generar("QR-2025-XYZ", usuario);**/
        
        //Ejercicio 14 
        
        Proyecto proyecto = new Proyecto("Video Trabajo practico", 10);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
        
    }
    
}
