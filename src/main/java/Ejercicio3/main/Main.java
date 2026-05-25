package Ejercicio3.main;
import Ejercicio3.modelo.Report;
import Ejercicio3.modelo.Reporte;
import Ejercicio3.modelo.ReporteConSobrescritura;
import Ejercicio3.modelo.ReporteSinSobrescritura;

import java.io.File;

public class Main {
     static void main() {

        Reporte reporteBase = new Report("Este es el contenido del reporte.");

        File archivo = new File("reporte.txt");

        // No permite sobrescribir
        Reporte reporteSeguro = new ReporteSinSobrescritura(reporteBase);
        reporteSeguro.export(archivo);

        // Sí permite sobrescribir
        Reporte reporteSobrescribible = new ReporteConSobrescritura(reporteBase);
        reporteSobrescribible.export(archivo);
    }
}