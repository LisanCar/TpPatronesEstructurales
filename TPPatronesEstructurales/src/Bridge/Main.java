package Bridge;

public class Main {
    public static void main(String[] args) {
        Notificacion emailPromocion = new Promocion(new Email());
        Notificacion  smsAlerta = new Alerta(new SMS());

        emailPromocion.notificar();
        smsAlerta.notificar();
    }
}