package visitor;

public class AlumnoRegular implements Alumno {
    private String nombre;

    public AlumnoRegular(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    @Override public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
