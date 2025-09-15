package Proxy;


public class ArchivoReal implements Archivo {
    private final String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir() {
        System.out.println("[ArchivoReal] Abriendo archivo: " + nombre);
    }
}
