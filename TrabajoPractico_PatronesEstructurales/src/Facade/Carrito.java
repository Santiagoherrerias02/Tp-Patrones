package Facade;

public class Carrito {
    public void agregar(int articulos) {
        System.out.println("[Carrito] Cantidad de artículo/s añadido/s: " + articulos);
    }

    public void eliminar() {
        System.out.println("[Carrito] Artículo/s eliminado/s");
    }
}
