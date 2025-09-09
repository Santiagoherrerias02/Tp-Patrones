package Bridge;

public class NotificacionAlerta extends Notificacion{
    public NotificacionAlerta(CanalEnvio canal){
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[Notificación de Alerta]");
        canal.enviarMensaje(mensaje);
    }
}
