
package trabajopractico5;

//import java.util.Date;

public class TrabajoPractico5 {

   
    public static void main(String[] args) {
       // Ejercicio 1  
     /**Foto foto= new Foto("foto3.jpg","JPEG");
       Pasaporte pasaporte = new Pasaporte("A123456", new Date(), foto);
       Titular titular = new Titular("Daniel Alderete", "12345678");
       
      pasaporte.setTitular(titular);

      System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
      System.out.println("Número de pasaporte del titular: " + titular.getPasaporte().getNumero()); **/
     
     
     // Ejercicio 2
    /** 
      Bateria bateria = new Bateria("Li-Ion X200", 2000);
      Celular celular = new Celular("IMEI123456789", "Samsung", "Galaxy S21", bateria);
      Usuario usuario = new Usuario("Jennifer Vega", 12345678);
      
      celular.setUsuario(usuario);

      System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());
      System.out.println("Modelo de batería: " + celular.getBateria().getModelo());
      System.out.println("Modelo del celular: " + celular.getMarca());
      System.out.println("IMEI del celular del usuario: " + usuario.getCelular().getImei());**/
    
    
    // Ejercicio 3
    /**
    Autor autor = new Autor("Jorge Luis Borges", "Argentina");
        Editorial editorial = new Editorial("Emecé", "Av. Santa Fe 1234");
        Libro libro = new Libro("Ficciones", "978-987-1234567", autor, editorial);

        System.out.println("Título del libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());**/
    
    // Ejercicio 4
    /**
    Banco banco = new Banco("Macro", "30-555-07");
    TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "04/27", banco);
    Cliente cliente = new Cliente ("Ciro Peredo", 36958741);
    
    tarjeta.setCliente(cliente);
    
    System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente().getNombre());
    System.out.println("Banco emisor: " + tarjeta.getBanco().getNombre());
    System.out.println("Número de tarjeta del cliente: " + cliente.getTarjeta().getNumero()); **/
    
    // Ejercicio 5
    /**
    PlacaMadre placa = new PlacaMadre("ASUS B550", "AMD B550");
    Computadora pc = new Computadora("HP", "SN123456", placa);
    Propietario propietario = new Propietario("Alberto Martinez", 12345678);

    pc.setPropietario(propietario);

    System.out.println("Propietario de la computadora: " + pc.getPropietario().getNombre());
    System.out.println("Modelo de placa madre: " + pc.getPlacaMadre().getModelo());
    System.out.println("Marca de la computadora del propietario: " + propietario.getComputadora().getMarca());**/
    
    // Ejercicio 6
    
    Cliente2 cliente = new Cliente2("Martin JUarez", "1231546698");
    Mesa mesa = new Mesa(10, 5);
    Reserva reserva = new Reserva("29/8/2025", "20:30", cliente, mesa);
    
    System.out.println("Reserva para: " + reserva.getCliente().getNombre());
    System.out.println("Mesa número: " + reserva.getMesa().getNumero());
    System.out.println("Fecha: " + reserva.getFecha() + " - Hora: " + reserva.getHora());
    
 
    }
    
}
