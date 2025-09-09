package abstractfactory;

public class EnvioExpress implements MetodoEnvio {
    @Override
    public void enviar(String libro) {
        System.out.println("Envío EXPRESS del libro: " + libro);
    }
}
