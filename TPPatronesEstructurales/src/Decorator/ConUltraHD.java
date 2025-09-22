package Decorator;

public class ConUltraHD extends PlanDecorador{
    public ConUltraHD(Plan plan) {
        super(plan);
    }
    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + UltraHD";
    }
    @Override
    public double getCosto() {
        return plan.getCosto() + 1000;
    }
}
