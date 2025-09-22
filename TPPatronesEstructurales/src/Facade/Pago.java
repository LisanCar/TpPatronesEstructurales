package Facade;

public class Pago {
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto);

        if (monto > 0) {
            System.out.println("Pago aprobado");
            return true;
        }
        else {
        System.out.println("Pago rechazado");
        return false;
        }
    }

}
