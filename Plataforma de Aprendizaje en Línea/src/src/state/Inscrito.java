package state;

public class Inscrito implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("Alumno ya está inscrito.");
    }
}