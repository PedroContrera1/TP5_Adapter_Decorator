package Ejercicio5.Entities;

public abstract class ConcursoDecorator implements ConcursoInterface {

    protected ConcursoInterface concurso;

    public ConcursoDecorator(ConcursoInterface concurso) {
        this.concurso = concurso;
    }

    @Override
    public void inscribir(Inscripcion inscripcion) {
        concurso.inscribir(inscripcion);
    }

    @Override
    public boolean estaInscripto(Participante participante) {
        return concurso.estaInscripto(participante);
    }

    @Override
    public boolean esInscriptoPrimerDia(Inscripcion inscripcion) {
        return concurso.esInscriptoPrimerDia(inscripcion);
    }

    @Override
    public String getIdConcurso() {
        return concurso.getIdConcurso();
    }
}