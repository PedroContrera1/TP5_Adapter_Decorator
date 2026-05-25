package Ejercicio1.adapter;

import Ejercicio1.model.Motor;
import Ejercicio1.model.MotorElectrico;

public class MotorElectricoAdapter implements Motor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        this.motorElectrico = new MotorElectrico();
    }

    @Override
    public void arrancar() {
        System.out.println("Adaptador: arrancando motor eléctrico...");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Adaptador: acelerando motor eléctrico...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Adaptador: apagando motor eléctrico...");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
