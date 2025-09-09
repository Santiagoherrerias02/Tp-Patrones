package factory;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter

public class LibroDigital implements Libro {
    private String titulo;
    private String autor;

    @Override
    public void mostrarInfo() {
        System.out.println("Libro Digital: " + titulo + " de " + autor);
    }
}
