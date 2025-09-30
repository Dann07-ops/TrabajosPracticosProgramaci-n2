
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
    /**
    Cliente2 cliente = new Cliente2("Martin JUarez", "1231546698");
    Mesa mesa = new Mesa(10, 5);
    Reserva reserva = new Reserva("29/8/2025", "20:30", cliente, mesa);
    
    System.out.println("Reserva para: " + reserva.getCliente().getNombre());
    System.out.println("Mesa número: " + reserva.getMesa().getNumero());
    System.out.println("Fecha: " + reserva.getFecha() + " - Hora: " + reserva.getHora());**/
    
    // Ejercicio 7
    /**
     Motor motor = new Motor("Diesel", "MTR-987654");
     Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Hilux", motor);
     Conductor conductor = new Conductor("Damian Godoy", "LIC-456789");

     vehiculo.setConductor(conductor);

     System.out.println("Conductor del vehículo: " + vehiculo.getConductor().getNombre());
     System.out.println("Tipo de motor: " + vehiculo.getMotor().getTipo());
     System.out.println("Modelo del vehículo del conductor: " + conductor.getVehiculo().getModelo());**/
    
    // Ejercicio 8
    /**
     Usuario2 usuario = new Usuario2("Daniel Torres", "daniel@example.com");
     FirmaDigital firma = new FirmaDigital("ABC123XYZ", "27/09/2025", usuario);
     Documento documento = new Documento("Contrato de Servicios", "Contenido legal del contrato...", firma);

    System.out.println("Documento: " + documento.getTitulo());
    System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
    System.out.println("Código de firma: " + documento.getFirma().getCodigoHash()); **/
    
    // Ejercicio 9
    /**
    Paciente paciente = new Paciente("Damian Gomez", "OSDE");
    Profesional profesional = new Profesional("Dra. Martínez", "Cardiología");
    CitaMedica cita = new CitaMedica("01/09/2025", "10:30", paciente, profesional);

    System.out.println("Paciente: " + cita.getPaciente().getNombre());
    System.out.println("Profesional: " + cita.getProfesional().getNombre());
    System.out.println("Fecha: " + cita.getFecha() + " - Hora: " + cita.getHora());**/
    
    // Ejercicio 10 
    /**
    ClaveSeguridad clave = new ClaveSeguridad("AA9987MN", "22/08/25");
    CuentaBancaria cuenta = new CuentaBancaria("000123456789", 150000.50, clave); 
    Titular2 titular =  new Titular2("Ramon Zalazar", 16988222);
    
    cuenta.setTitular(titular);

    System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
    System.out.println("CBU: " + cuenta.getCbu());
    System.out.println("Código de seguridad: " + cuenta.getClave().getCodigo()); **/
    
    
    
    
    
 
    }
    
}
