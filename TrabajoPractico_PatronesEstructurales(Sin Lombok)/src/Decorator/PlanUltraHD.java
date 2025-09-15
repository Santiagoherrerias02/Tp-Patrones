package Decorator;

public class PlanUltraHD extends SuscripcionDecorador{

    public PlanUltraHD(Suscripcion suscripcion){
        super(suscripcion);
    }

    @Override
    public String descripcion(){
        return suscripcion.descripcion() + " + Plan UltraHD";
    }

    @Override
    public double costo(){
        return suscripcion.costo() + 1000;
    }
}
