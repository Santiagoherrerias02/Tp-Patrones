import Adapter.Impresora;
import Adapter.ImpresoraPDF;
import Bridge.*;
import Composite.ElementoMenu;
import Composite.Menu;
import Composite.Plato;
import Decorator.*;
import Facade.*;
import Flyweight.Arbol;
import Flyweight.FabricaDeArboles;
import Proxy.Archivo;
import Proxy.ArchivoProxy;

public class Main {
    public static void main(String[] args) {

        // ================== ADAPTER ==================
        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN ADAPTER");
        System.out.println("========================================");

        Impresora impresora = new ImpresoraPDF();
        impresora.imprimir(".pdf", "PatronesEstructurales");
        impresora.imprimir(".txt", "ApuntesPE");
        impresora.imprimir(".doc", "TrabajoPracticoPE");

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================\n");

        // ================== BRIDGE ==================
        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN BRIDGE");
        System.out.println("========================================");

        Notificacion alertaEmail = new NotificacionAlerta(new CanalEmail());
        alertaEmail.enviar("Servidor caído.");

        Notificacion recordatorioSMS = new NotificacionRecordatorio(new CanalSMS());
        recordatorioSMS.enviar("Reunión a las 10:00.");

        Notificacion promoEmail = new NotificacionPromocion(new CanalEmail());
        promoEmail.enviar("¡50% de descuento en tu próxima compra!");

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================\n");

        // ================== DECORATOR ==================
        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN DECORATOR");
        System.out.println("========================================");

        Suscripcion basico = new PlanBasico();
        Suscripcion basicoHD = new PlanHD(new PlanBasico());
        Suscripcion combo = new PlanUltraHD(new DescargasOffline(new PlanBasico()));

        System.out.println("[Suscripción] " + basico.descripcion() + " → $" + basico.costo());
        System.out.println("[Suscripción] " + basicoHD.descripcion() + " → $" + basicoHD.costo());
        System.out.println("[Suscripción] " + combo.descripcion() + " → $" + combo.costo());

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================\n");

        // ================== FACADE ==================
        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN FACADE");
        System.out.println("========================================");

        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        TiendaFacade compra = new TiendaFacade(carrito, pago, envio);
        compra.comprar(8);

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================\n");

        // ================== FLYWEIGHT ==================
        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN FLYWEIGHT");
        System.out.println("========================================");

        FabricaDeArboles fabrica = new FabricaDeArboles();
        String[] tipos = {"Roble", "Pino", "Abeto"};

        int cantidad = 1_000_000;
        for (int i = 0; i < cantidad; i++) {
            String tipo = tipos[i % tipos.length];
            Arbol arbol = fabrica.obtenerArbol(tipo, "500px", "Verde");

            if (i < 10) {  // Solo mostramos los primeros 10
                arbol.dibujar(i % 1000, i / 1000);
            }
        }
        System.out.println("... (se omitieron " + (cantidad - 10) + " árboles)");
        System.out.println("Total de tipos únicos de árbol creados: " + fabrica.totalTipos());
        System.out.println("Total de árboles dibujados: " + cantidad);

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================");

        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN PROXY");
        System.out.println("========================================");

        Archivo archivo1 = new ArchivoProxy("NotasSecretas.txt", "santiago");
        archivo1.abrir();

        Archivo archivo2 = new ArchivoProxy("NotasSecretas.txt", "invitado");
        archivo2.abrir();

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================");

        System.out.println("========================================");
        System.out.println("         DEMO PATRÓN COMPOSITE");
        System.out.println("========================================");

        ElementoMenu comida1 = new Plato("Ñoquis");
        ElementoMenu comida2 = new Plato("Matambre a la pizza");
        ElementoMenu comida3 = new Plato("Arroz con pollo");
        ElementoMenu comida4 = new Plato("Queso Rallado");

        Menu menu1 = new Menu("Menu Pastas");
        menu1.addComida(comida1);
        menu1.addComida(comida4);

        Menu menu2 = new Menu("Menu del Dia");
        menu2.addComida(comida2);
        menu2.addComida(menu1);

        menu2.mostrar("");

        System.out.println("========================================");
        System.out.println("            FIN DE DEMO");
        System.out.println("========================================");
    }
}