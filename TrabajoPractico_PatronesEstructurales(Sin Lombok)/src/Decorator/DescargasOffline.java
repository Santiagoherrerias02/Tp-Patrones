package Decorator;

public class DescargasOffline extends SuscripcionDecorador{
    public DescargasOffline(Suscripcion suscripcion){
        super(suscripcion);
    }
    @Override
    public String descripcion(){
        return suscripcion.descripcion() + " + Descargas Offline";
    }
    @Override
    public double costo(){
        return suscripcion.costo() + 1000;
    }
}
