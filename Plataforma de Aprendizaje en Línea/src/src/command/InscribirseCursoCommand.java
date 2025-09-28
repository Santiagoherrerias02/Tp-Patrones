package command;

public class InscribirseCursoCommand implements Command {
    private Alumno alumno;
    private String curso;

    public InscribirseCursoCommand(Alumno a, String c) {
        this.alumno = a; this.curso = c;
    }
    @Override public void execute() {
        alumno.inscribirse(curso);
    }
}