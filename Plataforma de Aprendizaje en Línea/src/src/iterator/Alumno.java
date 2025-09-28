package iterator;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Curso> cursos = new ArrayList<>();

    public void inscribir(Curso c) {
        cursos.add(c);
    }

    public CursoIterator getIterator() {
        return new CursoIterator(cursos);
    }
}
