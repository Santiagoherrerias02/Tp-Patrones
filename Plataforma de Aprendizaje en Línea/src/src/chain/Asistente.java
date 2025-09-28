package chain;

public class Asistente implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud s) {
        if (s.tipo().equals("básica")) {
            System.out.println("Asistente resuelve la solicitud básica.");
        } else if (next != null) {
            next.handle(s);
        }
    }
}
