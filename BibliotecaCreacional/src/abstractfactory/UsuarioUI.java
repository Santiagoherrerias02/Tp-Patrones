package abstractfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class UsuarioUI implements InterfazUI {
    private String nombre;

    @Override
    public void mostrar() {
        System.out.println("Interfaz de USUARIO para: " + nombre);
    }
}
