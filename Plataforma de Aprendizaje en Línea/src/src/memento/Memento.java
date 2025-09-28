package memento;

import java.util.List;

public class Memento {
    private List<String> respuestas;

    public Memento(List<String> r) {
        this.respuestas = r;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }
}