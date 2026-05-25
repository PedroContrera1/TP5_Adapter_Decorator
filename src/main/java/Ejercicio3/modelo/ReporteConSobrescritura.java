package Ejercicio3;

import java.io.File;

public class ReporteConSobreescritura extends ReporteDecorator{
    public ReporteConSobreescritura(Reporte reporte){
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
