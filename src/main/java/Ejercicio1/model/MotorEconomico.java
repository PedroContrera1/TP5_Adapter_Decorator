package Ejercicio1.model;

public class MotorEconomico implements Motor {

    @Override
    public void arrancar() {
        System.out.println("Motor económico arrancando...");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor económico acelerando...");
    }

    @Override
    public void apagar() {
        System.out.println("Motor económico apagándose...");
    }
}
