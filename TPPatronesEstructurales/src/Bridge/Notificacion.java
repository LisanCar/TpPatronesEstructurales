package Bridge;

public abstract class Notificacion {
    protected CanalEnvio canalEnvio;

    public Notificacion(CanalEnvio canalEnvio) {
        this.canalEnvio = canalEnvio;
    }

    abstract void notificar();
}
