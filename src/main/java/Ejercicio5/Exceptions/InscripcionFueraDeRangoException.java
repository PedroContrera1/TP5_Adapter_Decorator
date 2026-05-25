package Ejercicio5.Exceptions;

public class InscripcionFueraDeRangoException extends RuntimeException {
    public InscripcionFueraDeRangoException(String message) {
        super(message);
    }
}
