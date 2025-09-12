package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    private String nombre;
    private List<ElementoMenu> comidas = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void addComida(ElementoMenu comida){
        comidas.add(comida);
    }

    @Override
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "[Menú] " + nombre);
        for (ElementoMenu comida : comidas) {
            comida.mostrar(indentacion + "   ");
        }
    }
}
