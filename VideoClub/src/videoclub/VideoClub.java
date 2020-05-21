
package videoclub;

import Objetos.Cliente;


public class VideoClub {
    
    public static void main(String[] args) {
       
         Cliente cliente;
        cliente = new Cliente();
        
        cliente.setNombre("Marcos");
        cliente.setApellido("Diaz");
        cliente.setDni(Integer.parseInt("36250145") );
        cliente.setDomicilio("Evita");
        cliente.setTelefono(Integer.parseInt("24168"));
        
        System.out.println("Clientes");
        
        System.out.println("nombre = "+cliente.getNombre());
        System.out.println("apellido = "+cliente.getApellido());
        System.out.println("Dni = "+cliente.getDni());
        System.out.println("Domicilio = "+cliente.getDomicilio());
       System.out.println("Telefono = "+cliente.getTelefono());
    
}
}
