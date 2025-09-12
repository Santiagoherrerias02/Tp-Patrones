package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }
        public void comprar() {
            System.out.println("[Facade] Iniciando Compra");
            carrito.agregar(8);
            carrito.eliminar();
            pago.PagoEfectivo();
            envio.EnvioExpress();
            System.out.println("[Facade] Compra finalizada");
        }
    }

