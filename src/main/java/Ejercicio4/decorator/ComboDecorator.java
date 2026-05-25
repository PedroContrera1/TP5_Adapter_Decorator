package Ejercicio4.decorator;

import Ejercicio4.modelo.Combo;

public abstract class ComboDecorator implements Combo {
    protected Combo combo;
    public ComboDecorator(Combo combo){
        this.combo=combo;
    }
}
