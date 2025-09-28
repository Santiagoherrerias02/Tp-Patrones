package mediator;

public class Alumno extends Usuario {
    public Alumno(ChatMediator m, String n) { super(m, n); }

    @Override public void enviar(String msg) {
        System.out.println(nombre + " envía: " + msg);
        mediator.enviar(msg, this);
    }
    @Override public void recibir(String msg) {
        System.out.println(nombre + " recibió: " + msg);
    }
}
