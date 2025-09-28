package iterator;

import java.util.List;

public class CursoIterator {
    private List<Curso> cursos;
    private int index = 0;

    public CursoIterator(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public boolean hasNext() {
        return index < cursos.size();
    }

    public Curso next() {
        return cursos.get(index++);
    }
}
