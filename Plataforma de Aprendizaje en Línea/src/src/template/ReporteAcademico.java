package template;

public abstract class ReporteAcademico {
    public final void generarReporte() {
        encabezado();
        contenido();
        pie();
    }

    protected void encabezado() {
        System.out.println("==== Reporte Académico ====");
    }

    protected abstract void contenido();

    protected void pie() {
        System.out.println("==== Fin Reporte ====");
    }
}

