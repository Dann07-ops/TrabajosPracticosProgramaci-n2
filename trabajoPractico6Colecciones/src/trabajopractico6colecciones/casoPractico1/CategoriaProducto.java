
package trabajopractico6colecciones;


public enum CategoriaProducto {
    ALIMENTOS("productos comestibles"), 
    ELECTRONICA("Dispositivos electrónicos"), 
    ROPA("Prendas de vestir"), 
    HOGAR("Articulos para el hogar");
    
    private final String descripcion;
    
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    
        
        
        
    }

    public String getDescripcion() {
        return descripcion;
    }
}
