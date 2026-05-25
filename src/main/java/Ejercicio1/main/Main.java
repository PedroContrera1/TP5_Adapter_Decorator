package Ejercicio1.main;

import Ejercicio1.adapter.MotorElectricoAdapter;
import Ejercicio1.model.*;

public class Main {
    static void main() {
        Motor motorComun = new MotorComun();
        Motor motorEconomico=new MotorEconomico();
        Motor motorElectrico=new MotorElectricoAdapter();
        System.out.println("=== MOTOR COMUN ===");
        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();

        System.out.println();

        System.out.println("=== MOTOR ECONÓMICO ===");
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        System.out.println();

        System.out.println("=== MOTOR ELÉCTRICO ADAPTADO ===");
        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();
    }
}

