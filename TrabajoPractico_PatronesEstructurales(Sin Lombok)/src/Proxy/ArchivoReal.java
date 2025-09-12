package Proxy;

// Objeto real
public class ArchivoReal implements Archivo {
    private final String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        System.out.println("[ArchivoReal] Abriendo archivo: " + nombre);
    }

    @Override
    public String toString() {
        return "ArchivoReal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
