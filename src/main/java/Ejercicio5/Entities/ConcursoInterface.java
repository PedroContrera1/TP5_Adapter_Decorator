package Ejercicio5.Entities;

public interface ConcursoInterface {
    void inscribir(Inscripcion inscripcion);
    boolean estaInscripto(Participante participante);
    boolean esInscriptoPrimerDia(Inscripcion inscripcion);
    String getIdConcurso();
}
