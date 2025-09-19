package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    private String nombre;
    private List<ElementoMenu> itemMenu = new ArrayList<>();

    public Menu(String nombre, List<ElementoMenu> itemMenu) {
        this.nombre = nombre;
        this.itemMenu = new ArrayList<>();
    }

    public void agregarComida(ElementoMenu comida){
        itemMenu.add(comida);
    }

    @Override
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "[Menú] " + nombre);
        for (ElementoMenu comida : itemMenu) {
            comida.mostrar(indentacion + "   ");
        }
    }
}
