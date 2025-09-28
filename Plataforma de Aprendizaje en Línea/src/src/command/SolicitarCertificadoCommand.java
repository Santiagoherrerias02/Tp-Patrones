package command;

public class SolicitarCertificadoCommand implements Command {
    private Alumno alumno;

    public SolicitarCertificadoCommand(Alumno a) {
        this.alumno = a;
    }

    @Override public void execute() {
        alumno.solicitarCertificado();
    }
}


