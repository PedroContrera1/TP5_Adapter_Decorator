package Ejercicio4;

public abstract class ComboDecorator implements Combo{
    protected Combo combo;
    public ComboDecorator(Combo combo){
        this.combo=combo;
    }
}
