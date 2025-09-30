
package trabajopractico5;


public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario2 usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario2 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario2 getUsuario() {
        return usuario;
    }
    
    
    
}
