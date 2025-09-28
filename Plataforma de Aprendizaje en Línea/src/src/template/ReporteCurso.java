package template;

public class ReporteCurso extends ReporteAcademico {
    @Override protected void contenido() {
        System.out.println("Contenido del reporte por curso.");
    }
}