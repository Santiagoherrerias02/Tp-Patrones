package Composite;

import lombok.Builder;
import java.util.ArrayList;
import java.util.List;

@Builder

public class Menu implements ElementoMenu{
    private String nombre;
    @Builder.Default
    private List<ElementoMenu> comidas = new ArrayList<>();

    public void agregarComida(ElementoMenu comida){
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
