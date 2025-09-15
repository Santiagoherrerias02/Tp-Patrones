package Proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ArchivoReal implements Archivo{
    private final String nombre;

    @Override
    public void abrir() {
        System.out.println("[ArchivoReal] Abriendo archivo: " + nombre);
    }
}
