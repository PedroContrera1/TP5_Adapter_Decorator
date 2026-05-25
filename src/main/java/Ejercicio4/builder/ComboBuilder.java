package Ejercicio4.builder;

import Ejercicio4.modelo.*;

public class ComboBuilder {

    private Combo combo;

    public ComboBuilder comboBasico(double precio,String descripcion) {
        this.combo = new ComboBasico(precio,descripcion);
        return this;
    }

    public ComboBuilder comboFamiliar(double precio,String descripcion) {
        this.combo = new ComboFamiliar(precio,descripcion);
        return this;
    }

    public ComboBuilder comboEspecial(double precio,String descripcion) {
        this.combo = new ComboEspecial(precio,descripcion);
        return this;
    }

    public ComboBuilder agregarTomate(int cantidad) {
        this.combo = new Tomate(combo,cantidad);
        return this;
    }

    public ComboBuilder agregarPapas(int cantidad) {
        this.combo = new Papas(combo,cantidad);
        return this;
    }

    public ComboBuilder agregarCarne(int cantidad) {
        this.combo = new Carne(combo,cantidad);
        return this;
    }

    public ComboBuilder agregarQueso(int cantidad) {
        this.combo = new Queso(combo,cantidad);
        return this;
    }

    public Combo build() {
        return combo;
    }
}