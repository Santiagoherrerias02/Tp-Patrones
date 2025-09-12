package Facade;

public class Carrito {
    public void agregar(int articulos) {
        System.out.println("[Carrito] Artículo añadido: " + articulos);
    }

    public void eliminar() {
        System.out.println("[Carrito] Artículo eliminado");
    }
}
