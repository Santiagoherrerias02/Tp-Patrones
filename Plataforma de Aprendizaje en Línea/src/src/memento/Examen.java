package memento;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String> respuestas = new ArrayList<>();

    public void contestar(String r) {
        respuestas.add(r);
    }

    public void mostrar() {
        System.out.println(respuestas);
    }

    public Memento save() {
        return new Memento(new ArrayList<>(respuestas));
    }

    public void restore(Memento m) {
        respuestas = new ArrayList<>(m.getRespuestas());
    }
}