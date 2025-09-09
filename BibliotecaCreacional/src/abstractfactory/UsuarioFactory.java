package abstractfactory;

public class UsuarioFactory implements AbstractFactory {
    @Override
    public InterfazUI crearUI(String nombre) {
        return new UsuarioUI(nombre);
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioExpress();
    }
}
