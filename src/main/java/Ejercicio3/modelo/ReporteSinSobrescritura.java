package Ejercicio3.modelo;

import Ejercicio3.decorator.ReporteDecorator;

import java.io.File;

public class ReporteSinSobrescritura extends ReporteDecorator {

    public ReporteSinSobrescritura(Reporte reporte){
        super(reporte);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe, no se puede sobreescribir"
            );
        }
        reporte.export(file);
    }
}
