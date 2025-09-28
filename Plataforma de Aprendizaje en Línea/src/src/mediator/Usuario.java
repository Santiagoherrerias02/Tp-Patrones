package mediator;

public abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(ChatMediator m, String nombre) {
        this.mediator = m; this.nombre = nombre;
    }

    public abstract void enviar(String msg);
    public abstract void recibir(String msg);
}
