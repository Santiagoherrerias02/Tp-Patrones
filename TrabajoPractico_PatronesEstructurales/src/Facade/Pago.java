package Facade;

public class Pago {
    public void PagoEfectivo() {
        System.out.println("[Pago] Método seleccionado: Efectivo");
    }

    public void PagoMixto(){
        System.out.println("[Pago] Método seleccionado: Efectivo y (Transferencia o Tarjeta)");
    }

    public void PagoTarjeta(){
        System.out.println("[Pago] Método seleccionado: Tarjeta");
    }

    public void PagoTransferencia(){
        System.out.println("[Pago] Método seleccionado: Transferencia");
    }
}
