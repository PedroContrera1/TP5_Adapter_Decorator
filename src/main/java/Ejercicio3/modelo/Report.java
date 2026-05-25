package Ejercicio3.modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Reporte{
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar...");
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
            System.out.println("Reporte exportado correctamente.");
        } catch (IOException e) {
            throw new RuntimeException("Error al exportar el reporte", e);
        }
    }
}
