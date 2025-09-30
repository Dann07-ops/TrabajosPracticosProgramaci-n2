
package trabajopractico5;

import java.util.Date;
public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto; // Composición
    private Titular titular; // Asociación bidireccional

    public Pasaporte(String numero, Date fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this);
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public String getNumero() {
        return numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }
    
    
    
}
