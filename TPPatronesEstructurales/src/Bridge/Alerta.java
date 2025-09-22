package Bridge;

public class Alerta extends Notificacion{
    public Alerta (CanalEnvio canalEnvio){
        super(canalEnvio);
    }

    @Override
    void notificar() {
        System.out.println("Enviando Alerta vía " + canalEnvio.enviar());
    }
}
