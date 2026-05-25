package Ejercicio4;

public class ComboFamiliar implements Combo{
    private double precio;
    private String descripcion;
    public ComboFamiliar(double precio,String descripcion){
        this.precio=precio;
        this.descripcion=descripcion;
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
