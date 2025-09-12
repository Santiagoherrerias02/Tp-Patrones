package Bridge;

// Refined Abstraction - Recordatorio
public class NotificacionRecordatorio extends Notificacion {
    public NotificacionRecordatorio(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[Notificación de Recordatorio]");
        canal.enviarMensaje(mensaje);
    }
}
