package Bridge;

public class Recordatorio extends Notificacion{
    public Recordatorio (CanalEnvio canalEnvio){
        super(canalEnvio);
    }

    @Override
    void notificar() {
        System.out.println("Enviando Recordatorio vía " + canalEnvio.enviar());
    }
}
