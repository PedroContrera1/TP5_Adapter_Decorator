package Ejercicio5.Persistencia;

import Ejercicio5.Entities.Participante;

public interface NotificadorInscripcion {

    void enviarConfirmacion (Participante participante,String idConcurso);

}
