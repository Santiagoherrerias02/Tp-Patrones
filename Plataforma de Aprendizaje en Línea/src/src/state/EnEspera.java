package state;

public class EnEspera implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("Alumno pasa de espera a inscrito.");
        i.setEstado(new Inscrito());
    }
}