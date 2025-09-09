package factory;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

public class LibroFisico implements Libro {
    private String titulo;
    private String autor;

    @Override
    public void mostrarInfo() {
        System.out.println("Libro Físico: " + titulo + " de " + autor);
    }
}
