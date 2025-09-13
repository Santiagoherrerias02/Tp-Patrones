package Composite;

public class Plato implements ElementoMenu {
    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "[Plato] " + nombre);
    }

}
