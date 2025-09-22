package Flyweight;

public class ArbolConcreto implements Arbol{
    private final String tipo;     // Estado intrínseco: tipo de árbol
    private final String textura;  // Estado intrínseco: textura
    private final String color;    // Estado intrínseco: color

    public ArbolConcreto(String tipo, String textura, String color) {
        this.tipo = tipo;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando árbol: " + tipo + ", textura: " + textura + ", color: " + color);
    }

    @Override
    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol '" + tipo + "' (" + textura + ", " + color + ") en posición (" + x + "," + y + ")");
    }
}
