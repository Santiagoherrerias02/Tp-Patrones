package mediator;

public class Profesor extends Usuario {
    public Profesor(ChatMediator m, String n) {
        super(m, n);
    }

    @Override public void enviar(String msg) {
        System.out.println("Profesor " + nombre + " envía: " + msg);
        mediator.enviar(msg, this);
    }

    @Override public void recibir(String msg) {
        System.out.println("Profesor " + nombre + " recibió: " + msg);
    }
}