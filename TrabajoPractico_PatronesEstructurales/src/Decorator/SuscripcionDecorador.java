package Decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public abstract class SuscripcionDecorador implements Suscripcion{
    protected final Suscripcion suscripcion;

    @Override
    public String descripcion(){
        return suscripcion.descripcion();
    }
    @Override
    public double costo(){
        return suscripcion.costo();
    }
}
