package abstractfactory;

public class EnvioNormal implements MetodoEnvio {
    @Override
    public void enviar(String libro) {
        System.out.println("Envío NORMAL del libro: " + libro);
    }
}