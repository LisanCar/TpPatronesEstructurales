package Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FabricaDeArboles fabrica = new FabricaDeArboles();
        Random random = new Random();

        // Tipos limitados de árboles (estado intrínseco)
        String[] tipos = {"Roble", "Pino", "Abedul"};
        String[] texturas = {"Rugosa", "Lisa"};
        String[] colores = {"Verde", "Marrón"};

        System.out.println("=== Simulando la creación de 1 millón de árboles ===");
        long inicio = System.currentTimeMillis();

        // Simular 1 millón de árboles
        for (int i = 0; i < 1000000; i++) {
            // Seleccionar propiedades intrínsecas aleatoriamente
            String tipo = tipos[random.nextInt(tipos.length)];
            String textura = texturas[random.nextInt(texturas.length)];
            String color = colores[random.nextInt(colores.length)];

            // Obtener árbol (reutilizando objetos existentes)
            Arbol arbol = fabrica.obtenerArbol(tipo, textura, color);

            // Estado extrínseco: posición aleatoria en el mapa
            int x = random.nextInt(10000);
            int y = random.nextInt(10000);

            // Solo dibujar algunos árboles para no saturar la consola
            if (i < 10) {
                arbol.dibujar(x, y);
            }
        }

        long fin = System.currentTimeMillis();

        System.out.println("\n=== Resultados ===");
        System.out.println("Árboles simulados: 1,000,000");
        System.out.println("Objetos únicos creados: " + fabrica.getTotalObjetosCreados());
        System.out.println("Tiempo transcurrido: " + (fin - inicio) + " ms");
        System.out.println("Memoria ahorrada: " + (1000000 - fabrica.getTotalObjetosCreados()) + " objetos");
    }
}


