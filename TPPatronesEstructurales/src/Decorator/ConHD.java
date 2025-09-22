package Decorator;

public class ConHD extends PlanDecorador{
    public ConHD(Plan plan) {
        super(plan);
    }
    @Override
    public String getDescripcion() {
        return plan.getDescripcion() + " + HD";
    }
    @Override
    public double getCosto() {
        return plan.getCosto() + 500;
    }

}
