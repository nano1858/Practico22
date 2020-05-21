
package Objetos;


public class Usuario extends Cliente{
    
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + '}';
    }
    
}
