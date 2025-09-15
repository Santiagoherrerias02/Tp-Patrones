package Proxy;

import lombok.Builder;

@Builder

public class ArchivoProxy implements Archivo {
    private final String nombre;
    private final String usuario;
    private ArchivoReal archivoReal;

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
