package Bridge;

public class CanalEmail implements CanalEnvio{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[Canal Email] Enviando mensaje: " + mensaje);
    }
}
