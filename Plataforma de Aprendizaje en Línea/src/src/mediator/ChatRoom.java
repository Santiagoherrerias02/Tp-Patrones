package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviar(String msg, Usuario u) {
        for (Usuario user : usuarios) {
            if (user != u) user.recibir(msg);
        }
    }

    @Override
    public void registrar(Usuario u) {
        usuarios.add(u);
    }
}