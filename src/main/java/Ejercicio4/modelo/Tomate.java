package Ejercicio4;

public class Tomate extends ComboDecorator {

    private int cantidad;

    public Tomate(Combo combo, int cantidad) {
        super(combo);
        this.cantidad = cantidad;
    }

    @Override
    public String getDescripcion() {
        return combo.getDescripcion() + " + " + cantidad + " tomate";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + (cantidad * 300);
    }
}