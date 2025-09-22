package Facade;

public class Main {
    public static void main(String[] args) {

        Pago pago = new Pago();
        Envio envio = new Envio();
        Carrito carrito = new Carrito();

        TiendaFacade tienda = new TiendaFacade(envio, carrito, pago);

        tienda.comprar("Laptop Gaming", 1, 1500.00, "Av. Corrientes 1234, Buenos Aires");

        System.out.println();

        tienda.comprar("Mouse Inalámbrico", 2, 35.50, "Calle San Martín 567, Córdoba");
    }
}
