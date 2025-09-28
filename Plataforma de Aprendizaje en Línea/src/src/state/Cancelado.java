package state;

public class Cancelado implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("Inscripción cancelada. No puede avanzar.");
    }
}