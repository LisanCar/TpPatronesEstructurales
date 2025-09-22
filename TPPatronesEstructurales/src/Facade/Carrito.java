package Facade;

public class Carrito {
    public void agregarProducto(String producto, int cantidad, double precio) {
        System.out.println("Agregado al carrito: " + producto + " - Cantidad: " + cantidad + " - Precio unitario: $" + precio);
    }
}
