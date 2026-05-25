package Ejercicio3.decorator;

import Ejercicio3.modelo.Reporte;

public abstract class ReporteDecorator implements Reporte {
    protected Reporte reporte;
    public ReporteDecorator(Reporte reporte){
        this.reporte=reporte;
    }
}
