package Decorator;

public class PlanBasico implements Suscripcion {

    @Override
    public String descripcion() {
        return "Plan Básico";
    }

    @Override
    public double costo() {
        return 1000;
    }

    @Override
    public String toString() {
        return "PlanBasico{descripcion='" + descripcion() + "', costo=" + costo() + "}";
    }
}

