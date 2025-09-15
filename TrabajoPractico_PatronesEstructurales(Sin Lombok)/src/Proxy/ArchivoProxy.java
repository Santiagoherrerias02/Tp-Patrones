package Proxy;

public class ArchivoProxy implements Archivo {
    private final String nombre;
    private final String usuario;
    private ArchivoReal archivoReal;

    public ArchivoProxy(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (tienePermiso(usuario)) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombre);
            }
            System.out.println("[Proxy] Acceso concedido al usuario: " + usuario);
            archivoReal.abrir();
        } else {
            System.out.println("[Proxy] Acceso DENEGADO al usuario: " + usuario);
        }
    }

    // Simulación de control de permisos
    private boolean tienePermiso(String usuario){
        return usuario.equalsIgnoreCase("admin") || usuario.equalsIgnoreCase("santiago");
    }
}
