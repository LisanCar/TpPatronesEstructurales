package Bridge;

public class SMS extends CanalEnvio{
    @Override
    String enviar() {
        return "SMS";
    }
}
