package Ejercicio4;

public class ComboBasico implements Combo{
    private double precio;
    private String descripcion;
    public ComboBasico(double precio,String descripcion){
        this.precio=precio;
        this.descripcion=descripcion;
    }
    @Override
    public String getDescripcion() {
        return precio+" "+descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
