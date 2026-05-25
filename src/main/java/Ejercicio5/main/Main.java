package Ejercicio5.main;

import Ejercicio5.Entities.*;
import Ejercicio5.Persistencia.*;

import java.sql.Connection;
import java.time.LocalDate;

public class Main {
    static void main() {
        Connection conexion = connectionBD.obtenerConexion();

        RegistroInscripcion registro = new RegistroInscripcionBD(conexion);

        NotificadorInscripcion notificador = new NotificadorInscripcionMail(
                "smtp.mailtrap.io",
                587,
                "usuario",
                "password",
                "no-reply@concurso.com"
        );

        ConcursoInterface concursoBase = new Concurso(
                "CONCURSO-01",
                LocalDate.of(2026, 5, 1),
                LocalDate.of(2026, 5, 30),
                registro
        );

        ConcursoInterface concursoConEmail = new ConcursoConEmailDecorator(
                concursoBase,
                notificador
        );

        Participante participante = new Participante(
                "1",
                "Pedro",
                "pedro@gmail.com"
        );

        Inscripcion inscripcion = new Inscripcion(
                participante,
                LocalDate.of(2026, 5, 1)
        );

        concursoConEmail.inscribir(inscripcion);

        System.out.println("Puntos del participante: " + participante.getPuntos());
    }

    public static NotificadorInscripcion getNotificador (){
        return new NotificadorInscripcionMail(
                "sandbox.smtp.mailtrap.io",
                2525,
                "692498a3dff362",
                "7f757d0825d4b2",
                "test@mailtrap.io"
        );
    }

}
