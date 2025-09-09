package Decorator;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class PlanBasico implements Suscripcion{
    @Override
    public String descripcion() {
        return "Plan Básico";
    }

    @Override
    public double costo() {
        return 1000;
    }
}
