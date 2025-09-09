package Composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Plato implements ElementoMenu{
    private String nombre;


    @Override
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "[Plato] " + nombre);
    }

}
