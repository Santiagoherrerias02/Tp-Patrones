package abstractfactory;

public class AdminFactory implements AbstractFactory {
    @Override
    public InterfazUI crearUI(String nombre) {
        return new AdminUI(nombre);
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioNormal();
    }
}
