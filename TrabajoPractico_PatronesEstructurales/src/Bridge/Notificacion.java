package Bridge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public abstract class Notificacion {
    protected final CanalEnvio canal;

    public abstract void enviar(String mensaje);
}

