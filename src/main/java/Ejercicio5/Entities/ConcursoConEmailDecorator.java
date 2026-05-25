package Ejercicio5.Entities;
import Ejercicio5.Persistencia.NotificadorInscripcion;

public class ConcursoConEmailDecorator extends ConcursoDecorator {

    private final NotificadorInscripcion notificador;

    public ConcursoConEmailDecorator(ConcursoInterface concurso,
                                     NotificadorInscripcion notificador) {
        super(concurso);
        this.notificador = notificador;
    }

    @Override
    public void inscribir(Inscripcion inscripcion) {
        concurso.inscribir(inscripcion);

        notificador.enviarConfirmacion(
                inscripcion.getParticipante(),
                concurso.getIdConcurso()
        );
    }
}