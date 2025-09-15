package Decorator;

public class PlanHD extends SuscripcionDecorador{

    public PlanHD(Suscripcion suscripcion){
        super(suscripcion);
    }

    @Override
    public String descripcion(){
        return suscripcion.descripcion() + " + Plan HD";
    }

    @Override
    public double costo(){
        return suscripcion.costo() + 500;
    }
}
