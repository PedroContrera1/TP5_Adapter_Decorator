package Ejercicio3.modelo;

import Ejercicio3.decorator.ReporteDecorator;

import java.io.File;

public class ReporteConSobrescritura extends ReporteDecorator {
    public ReporteConSobrescritura(Reporte reporte){
        super(reporte);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        System.out.println("Se permite sobreescribir el archivo si existe");
        reporte.export(file);
    }
}
