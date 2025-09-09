package factory;

public class LogisticaLibro {

    public static Libro crearLibro(String tipo, String titulo, String autor) {
        return switch (tipo.toLowerCase()) {
            case "fisico" -> new LibroFisico(titulo, autor);
            case "digital" -> new LibroDigital(titulo, autor);
            default -> throw new IllegalArgumentException("Tipo de libro no soportado: " + tipo);
        };
    }
}
