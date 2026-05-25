package Ejercicio5.Persistencia;

import Ejercicio5.Entities.Inscripcion;

public interface RegistroInscripcion {
    void guardar(Inscripcion inscripcion, String idConcurso);
}