package chain;

public class Profesor implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud s) {
        if (s.tipo().equals("media")) {
            System.out.println("Profesor resuelve la solicitud intermedia.");
        } else if (next != null) {
            next.handle(s);
        }
    }
}
