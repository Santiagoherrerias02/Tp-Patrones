package template;

public class ReporteAlumno extends ReporteAcademico {
    @Override protected void contenido() {
        System.out.println("Contenido del reporte por alumno.");
    }
}
