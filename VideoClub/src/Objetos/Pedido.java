
package Objetos;

import java.util.Date;

public class Pedido {
    
    private Integer id;
    private Date fecha;
    private Integer precioTotal;
    
    private Catalogo catalogo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id=" + id + ", fecha=" + fecha + ", precioTotal=" + precioTotal + '}';
    }
    
    
    
}
