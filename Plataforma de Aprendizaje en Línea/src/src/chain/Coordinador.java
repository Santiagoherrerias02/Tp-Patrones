package chain;

public class Coordinador implements Handler {

    @Override
    public void setNext(Handler next) {
    }

    @Override
    public void handle(Solicitud s) {
        System.out.println("Coordinador atiende la solicitud compleja.");
    }
}