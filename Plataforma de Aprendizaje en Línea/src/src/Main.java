import chain.*;
import command.*;
import iterator.*;
import mediator.*;
import memento.*;
import observer.*;
import state.*;
import strategy.*;
import template.*;
import visitor.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n===============================");
        System.out.println("  PATRÓN CHAIN OF RESPONSIBILITY");
        System.out.println("===============================");
        Handler asistente = new Asistente();
        Handler profesor = new chain.Profesor();
        Handler coordinador = new Coordinador();
        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        System.out.println("Solicitud básica → debería resolver el Asistente");
        asistente.handle(new Solicitud("básica"));
        System.out.println("Solicitud intermedia → debería resolver el Profesor");
        asistente.handle(new Solicitud("media"));
        System.out.println("Solicitud compleja → debería resolver el Coordinador");
        asistente.handle(new Solicitud("compleja"));


        System.out.println("\n===============================");
        System.out.println("        PATRÓN COMMAND");
        System.out.println("===============================");
        command.Alumno alumnoCmd = new command.Alumno("Juan");
        Invoker invoker = new Invoker();

        System.out.println("Alumno se inscribe en Matemáticas (Command)");
        invoker.addCommand(new InscribirseCursoCommand(alumnoCmd, "Matemáticas"));
        System.out.println("Alumno solicita un certificado (Command)");
        invoker.addCommand(new SolicitarCertificadoCommand(alumnoCmd));
        invoker.run();


        System.out.println("\n===============================");
        System.out.println("        PATRÓN ITERATOR");
        System.out.println("===============================");
        iterator.Alumno alumnoIt = new iterator.Alumno();
        alumnoIt.inscribir(new iterator.Curso("Historia"));
        alumnoIt.inscribir(new iterator.Curso("Programación"));
        iterator.CursoIterator it = alumnoIt.getIterator();

        System.out.println("Listando cursos del alumno usando un Iterator:");
        while (it.hasNext()) {
            System.out.println(" - " + it.next().getNombre());
        }


        System.out.println("\n===============================");
        System.out.println("        PATRÓN MEDIATOR");
        System.out.println("===============================");
        ChatMediator chat = new ChatRoom();
        mediator.Alumno a1 = new mediator.Alumno(chat, "Carlos");
        mediator.Profesor p1 = new mediator.Profesor(chat, "Gómez");
        chat.registrar(a1);
        chat.registrar(p1);

        System.out.println("Carlos envía un mensaje al profesor a través del Mediator:");
        a1.enviar("Hola profesor!");
        System.out.println("Profesor responde a través del Mediator:");
        p1.enviar("Hola Carlos, bienvenido.");


        System.out.println("\n===============================");
        System.out.println("        PATRÓN MEMENTO");
        System.out.println("===============================");
        Examen examen = new Examen();
        examen.contestar("Pregunta1: A");
        Memento save = examen.save();
        examen.contestar("Pregunta2: B");
        System.out.println("Examen actual (con dos respuestas):");
        examen.mostrar();
        examen.restore(save);
        System.out.println("Examen restaurado al momento de la primera respuesta:");
        examen.mostrar();


        System.out.println("\n===============================");
        System.out.println("        PATRÓN OBSERVER");
        System.out.println("===============================");
        observer.Curso cursoObs = new observer.Curso();
        cursoObs.agregar(new observer.Alumno("Pedro"));
        cursoObs.agregar(new observer.Alumno("Lucía"));

        System.out.println("Se publica una nueva clase → todos los alumnos son notificados:");
        cursoObs.notificar("Nueva clase disponible.");


        System.out.println("\n===============================");
        System.out.println("        PATRÓN STATE");
        System.out.println("===============================");
        Inscripcion insc = new Inscripcion(new EnEspera());

        System.out.println("Alumno está EN ESPERA, se procesa inscripción:");
        insc.procesar();
        System.out.println("Alumno ya está INSCRITO, se procesa nuevamente:");
        insc.procesar();


        System.out.println("\n===============================");
        System.out.println("        PATRÓN STRATEGY");
        System.out.println("===============================");
        List<Integer> notas = Arrays.asList(7, 8, 9);
        strategy.CalculoNota s1 = new PromedioSimple();
        strategy.CalculoNota s2 = new PromedioPonderado();
        strategy.CalculoNota s3 = new ExamenExtra();

        System.out.println("Notas: " + notas);
        System.out.println("Promedio simple: " + s1.calcular(notas));
        System.out.println("Promedio ponderado: " + s2.calcular(notas));
        System.out.println("Promedio con examen extra: " + s3.calcular(notas));


        System.out.println("\n===============================");
        System.out.println("    PATRÓN TEMPLATE METHOD");
        System.out.println("===============================");
        ReporteAcademico r1 = new ReporteCurso();
        ReporteAcademico r2 = new ReporteAlumno();

        System.out.println("Generando reporte por curso:");
        r1.generarReporte();
        System.out.println("Generando reporte por alumno:");
        r2.generarReporte();


        System.out.println("\n===============================");
        System.out.println("          PATRÓN VISITOR");
        System.out.println("===============================");
        visitor.Alumno reg = new AlumnoRegular("Marta");
        visitor.Alumno bec = new AlumnoBecado("Luis");
        Visitor aplicar = new AplicarBeca();

        System.out.println("Aplicando visita a Alumno Regular:");
        reg.aceptar(aplicar);
        System.out.println("Aplicando visita a Alumno Becado:");
        bec.aceptar(aplicar);
    }
}

