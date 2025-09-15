package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
        System.out.println("[Facade] Ingresando Compra");
    }

    public void comprar(String articulos) {
        carrito.elegirArticulos(articulos);
    }

    public void terminarCompra(){
        pago.PagoEfectivo();
        envio.EnvioExpress();
        System.out.println("[Facade] Compra finalizada");
    }
}

