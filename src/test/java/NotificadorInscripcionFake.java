import Ejercicio5.Entities.Participante;
import Ejercicio5.Persistencia.NotificadorInscripcion;

import java.util.ArrayList;
import java.util.List;
public class NotificadorInscripcionFake implements NotificadorInscripcion {
    private final List<Participante> participantesNotificados = new ArrayList<>();
    private final List<String> concursosNotificados = new ArrayList<>();

    @Override
    public void enviarConfirmacion(Participante participante, String idConcurso) {
        participantesNotificados.add(participante);
        concursosNotificados.add(idConcurso);
    }

    public int cantidadEnviados() {
        return participantesNotificados.size();
    }


    public String ultimoConcursoNotificado() {
        return concursosNotificados.getLast();
    }

    public boolean seEnvioMail() {
        return !participantesNotificados.isEmpty();
    }
}
