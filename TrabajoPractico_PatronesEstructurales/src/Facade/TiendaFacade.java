package Facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

        public void comprar(String articulos) {
            System.out.println("[Facade] Ingresando Compra");
            carrito.elegirArticulos(articulos);
        }
        public void terminarCompra(){
            pago.PagoEfectivo();
            envio.EnvioExpress();
            System.out.println("[Facade] Compra finalizada");
        }
    }

