package Bridge;

public class Promocion extends Notificacion {
    public Promocion(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    void notificar() {
        System.out.println("Enviando Promocion vía " + canalEnvio.enviar());
    }
}
