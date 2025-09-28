package command;

public class AbandonarCursoCommand implements Command {
    private Alumno alumno;
    private String curso;

    public AbandonarCursoCommand(Alumno a, String c) {
        this.alumno = a; this.curso = c;
    }
    @Override public void execute() {
        alumno.abandonar(curso);
    }
}
