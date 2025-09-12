package Factory_Method;

public abstract class Libro {
    private String nombre;
    private String autor;
    private int precio;

    public Libro(String nombre, String autor, int precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio;
    }
}
