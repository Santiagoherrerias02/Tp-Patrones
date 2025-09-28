package state;

public class Inscripcion {
    private EstadoInscripcion estado;

    public Inscripcion(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public void setEstado(EstadoInscripcion e) {
        this.estado = e;
    }

    public void procesar() {
        estado.cambiarEstado(this);
    }
}
