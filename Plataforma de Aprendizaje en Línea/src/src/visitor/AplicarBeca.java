package visitor;

public class AplicarBeca implements Visitor {

    @Override
    public void visitar(AlumnoRegular a) {
        System.out.println("Alumno regular " + a.getNombre() + " sin beca aplicada.");
    }

    @Override
    public void visitar(AlumnoBecado a) {
        System.out.println("Alumno becado " + a.getNombre() + " recibe descuento del 50%.");
    }
}