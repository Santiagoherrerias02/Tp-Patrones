package command;

public class Alumno {
    private String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirse(String curso) {
        System.out.println(nombre + " se inscribió en " + curso);
    }

    public void abandonar(String curso) {
        System.out.println(nombre + " abandonó " + curso);
    }

    public void solicitarCertificado() {
        System.out.println(nombre + " solicitó certificado.");
    }
}