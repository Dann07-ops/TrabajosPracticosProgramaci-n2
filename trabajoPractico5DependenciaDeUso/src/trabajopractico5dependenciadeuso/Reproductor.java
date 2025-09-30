
package trabajopractico5dependenciadeuso;


public class Reproductor {
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: "+ cancion.getTitulo()+ " Artista: " + cancion.getArtista().getNombre());
    }
}
