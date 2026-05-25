package Ejercicio3;

import java.io.File;

public class ReporteSinSobreescritura extends ReporteDecorator{

    public ReporteSinSobreescritura(Reporte reporte){
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
