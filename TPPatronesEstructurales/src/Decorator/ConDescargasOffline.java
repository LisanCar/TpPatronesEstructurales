package Decorator;

public class ConDescargasOffline extends PlanDecorador{
    public ConDescargasOffline(Plan plan) {
            super(plan);
    }
    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + Descargas Offline";
    }
    @Override
    public double getCosto() {
        return plan.getCosto() + 700;
    }
}

