package prototype;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Prestamo implements Cloneable {
    private String libro;
    private String usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @Override
    public Prestamo clone() {
        try {
            return (Prestamo) super.clone(); // shallow copy suficiente
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrar() {
        System.out.println("Libro: " + libro);
        System.out.println("Usuario: " + usuario);
        System.out.println("Desde: " + fechaInicio + " hasta " + fechaFin);
    }
}


