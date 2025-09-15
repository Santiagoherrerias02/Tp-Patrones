package Flyweight;

public class ArbolConcreto implements Arbol{
    private final String tipo;
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando objeto para el arbol "+ tipo);
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando arbol ´" + tipo + ", "+ textura +", "+ color +"´ en posición (" + x + " , " + y +")");

    }
}
