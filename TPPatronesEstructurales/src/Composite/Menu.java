package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    String nombreMenu;
    private List<ElementoMenu> elementos = new ArrayList<>();

    public Menu(String nombreMenu) {
        this.nombreMenu = nombreMenu;
    }

    public void agregarElemento(ElementoMenu elementoMenu) {
        elementos.add(elementoMenu);
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre Menú: " + nombreMenu);
        for (ElementoMenu i : elementos) {
            i.mostrar();
        }
        System.out.println("Precio del menú: " + getPrecio());
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ElementoMenu i : elementos) {
            total += i.getPrecio();
        }
        return total;
    }
}
