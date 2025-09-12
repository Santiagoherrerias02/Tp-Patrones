package Factory_Method;

public class LibroFisico extends Libro {
    public LibroFisico(String nombre, String autor, int precio) {
        super(nombre, autor, precio);
    }

    @Override
    public String toString() {
        return "LibroFisico{" + super.toString() + "}";
    }
}
