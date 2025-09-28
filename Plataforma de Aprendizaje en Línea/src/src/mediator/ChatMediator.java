package mediator;

public interface ChatMediator {
    void enviar(String msg, Usuario u);
    void registrar(Usuario u);
}
