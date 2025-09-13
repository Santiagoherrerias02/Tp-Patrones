package Decorator;

public abstract class SuscripcionDecorador implements Suscripcion {
    protected final Suscripcion suscripcion;

    public SuscripcionDecorador(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    @Override
    public String descripcion() {
        return suscripcion.descripcion();
    }

    @Override
    public double costo() {
        return suscripcion.costo();
    }

}
