
import factory.Libro;
import factory.LogisticaLibro;
import singleton.Database;
import abstractfactory.*;
import builder.Usuario;
import prototype.Prestamo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ============================================================
        System.out.println("========================================");
        System.out.println("        PARTE 1 – SINGLETON");
        System.out.println("========================================");

        Database db1 = Database.getInstancia();
        Database db2 = Database.getInstancia();

        System.out.println("¿db1 y db2 son la misma instancia? " + (db1 == db2));

        Libro libro1 = LogisticaLibro.crearLibro("fisico", "Cien Años de Soledad", "García Márquez");
        Libro libro2 = LogisticaLibro.crearLibro("digital", "El Quijote", "Cervantes");

        db1.agregarLibro(libro1);
        db2.agregarLibro(libro2);

        System.out.println("Libros en la base de datos:");
        db1.listarLibros().forEach(Libro::mostrarInfo);

        // ============================================================
        System.out.println("\n========================================");
        System.out.println("           PARTE 2 – FACTORY METHOD");
        System.out.println("========================================");

        Libro l1 = LogisticaLibro.crearLibro("fisico", "Rayuela", "Cortázar");
        Libro l2 = LogisticaLibro.crearLibro("digital", "La Odisea", "Homero");

        l1.mostrarInfo();
        l2.mostrarInfo();

        // ============================================================
        System.out.println("\n========================================");
        System.out.println("        PARTE 3 – ABSTRACT FACTORY");
        System.out.println("========================================");

        AbstractFactory adminFactory = new AdminFactory();
        AbstractFactory usuarioFactory = new UsuarioFactory();

        InterfazUI uiAdmin = adminFactory.crearUI("María");
        MetodoEnvio envioAdmin = adminFactory.crearEnvio();

        InterfazUI uiUsuario = usuarioFactory.crearUI("Juan");
        MetodoEnvio envioUsuario = usuarioFactory.crearEnvio();

        uiAdmin.mostrar();
        envioAdmin.enviar("Cien Años de Soledad");

        uiUsuario.mostrar();
        envioUsuario.enviar("La Odisea");

        // ============================================================
        System.out.println("\n========================================");
        System.out.println("        PARTE 4 – BUILDER");
        System.out.println("========================================");

        Usuario u1 = new Usuario.Builder()
                .nombre("Ana")
                .email("ana@mail.com")
                .direccion("Calle Falsa 123")
                .telefono("123456789")
                .fechaNacimiento(LocalDate.of(1995, 5, 20))
                .build();

        Usuario u2 = new Usuario.Builder()
                .nombre("Carlos")
                .email("carlos@mail.com")
                .build();

        System.out.println("Usuario 1: " + u1);
        System.out.println("Usuario 2: " + u2);

        // ============================================================
        System.out.println("\n========================================");
        System.out.println("        PARTE 5 – PROTOTYPE");
        System.out.println("========================================");

        Prestamo pr1 = new Prestamo("El Quijote", "Carlos",
                LocalDate.now(), LocalDate.of(2025, 10, 8));

        Prestamo copia1pr1 = pr1.clone();
        Prestamo copia2pr1 = pr1.clone();

        System.out.println("\n--- Prestamo Original ---");
        pr1.mostrar();

        System.out.println("\n--- Copia 1 ---");
        copia1pr1.mostrar();

        System.out.println("\n--- Copia 2 ---");
        copia2pr1.mostrar();

        System.out.println("\nComparando objetos:");
        System.out.println("pr1 == copia1pr1 ? " + (pr1 == copia1pr1));
        System.out.println("pr1 == copia2pr1 ? " + (pr1 == copia2pr1));
    }
}
