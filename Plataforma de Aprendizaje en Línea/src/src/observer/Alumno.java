package observer;

public class Alumno implements Observer {
    private String nombre;

    public Alumno(String n) {
        nombre = n;
    }

    @Override
    public void update(String msg) {
        System.out.println(nombre + " recibió notificación: " + msg);
    }
}