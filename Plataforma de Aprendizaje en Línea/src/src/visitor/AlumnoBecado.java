package visitor;

public class AlumnoBecado implements Alumno {
    private String nombre;

    public AlumnoBecado(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    @Override public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
