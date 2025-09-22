package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade(Envio envio, Carrito carrito, Pago pago) {
        this.envio = envio;
        this.carrito = carrito;
        this.pago = pago;
    }

    public void comprar(String producto, int cantidad, double precio, String direccionEnvio) {
        carrito.agregarProducto(producto, cantidad, precio);

        double total = cantidad * precio;

        boolean pagoExitoso = pago.procesarPago(total);

        if (pagoExitoso) {
            envio.coordinarEntrega(direccionEnvio);
            System.out.println("Compra completada exitosamente");
        } else {
            System.out.println("Compra cancelada.");
        }
    }
}
