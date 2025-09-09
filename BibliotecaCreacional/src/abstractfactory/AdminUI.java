package abstractfactory;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class AdminUI implements InterfazUI {
    private String nombre;

    @Override
    public void mostrar() {
        System.out.println("Interfaz de ADMIN para: " + nombre);
    }
}