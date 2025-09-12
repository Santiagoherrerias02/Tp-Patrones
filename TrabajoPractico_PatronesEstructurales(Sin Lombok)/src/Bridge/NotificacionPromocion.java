package Bridge;

// Refined Abstraction - Promoción
public class NotificacionPromocion extends Notificacion {
    public NotificacionPromocion(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[Notificación de Promoción]");
        canal.enviarMensaje(mensaje);
    }
}
