package Bridge;

public class CanalSMS implements CanalEnvio {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[Canal SMS] Enviando mensaje: " + mensaje);
    }
}
