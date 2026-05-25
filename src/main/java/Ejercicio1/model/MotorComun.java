package Ejercicio1.model;

public class MotorComun implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor común arrancando...");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor común acelerando...");
    }

    @Override
    public void apagar() {
        System.out.println("Motor común apagándose...");
    }
}
