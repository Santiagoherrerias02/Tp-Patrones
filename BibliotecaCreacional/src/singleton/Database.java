package singleton;

import factory.Libro;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE) // evita new Database()
public class Database {
    private static Database instancia;

    @Getter
    private final List<Libro> libros = Collections.synchronizedList(new ArrayList<>());

    public static synchronized Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> listarLibros() {
        return new ArrayList<>(libros);
    }
}




