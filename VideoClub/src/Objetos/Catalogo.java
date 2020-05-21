
package Objetos;


public class Catalogo {
    
    private Integer id , cantidad;
    
    private Pelicula pelicula;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id=" + id + ", cantidad=" + cantidad + ", pelicula=" + pelicula + '}';
    } 
    
}
