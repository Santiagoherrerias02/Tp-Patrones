package abstractfactory;

public interface AbstractFactory {
    InterfazUI crearUI(String nombre);
    MetodoEnvio crearEnvio();
}
