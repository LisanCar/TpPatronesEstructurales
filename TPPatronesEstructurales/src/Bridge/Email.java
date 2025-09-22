package Bridge;

public class Email extends CanalEnvio{
    @Override
    String enviar() {
        return "Email";
    }
}
