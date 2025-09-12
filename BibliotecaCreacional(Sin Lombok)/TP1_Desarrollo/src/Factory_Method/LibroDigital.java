package Factory_Method;

public class LibroDigital extends Libro {
    public LibroDigital(String nombre, String autor, int precio) {
        super(nombre, autor, precio);
    }

    @Override
    public String toString() {
        return "LibroDigital{" + super.toString() + "}";
    }
}
