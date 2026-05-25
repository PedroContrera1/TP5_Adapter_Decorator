package Ejercicio4;
public class Queso extends ComboDecorator {

    private int cantidad;

    public Queso(Combo combo, int cantidad) {
        super(combo);
        this.cantidad = cantidad;
    }

    @Override
    public String getDescripcion() {
        return combo.getDescripcion() + " + " + cantidad + " queso";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + (cantidad * 500);
    }
}