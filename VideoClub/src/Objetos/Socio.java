
package Objetos;


public class Socio extends Cliente{
   
    private Integer id;
    
    private Tarjeta tarjeta;
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public String toString() {
        return "Socio{" + "id=" + id + '}';
    }
    
    
    
    
}
