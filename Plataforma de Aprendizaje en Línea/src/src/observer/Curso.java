package observer;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Observer> observadores = new ArrayList<>();

    public void agregar(Observer o) {
        observadores.add(o);
    }

    public void notificar(String msg) {
        for (Observer o : observadores) o.update(msg);
    }
}