package Decorator;

public class Main {
    public static void main(String[] args) {
        Plan plan = new PlanBasico();
        System.out.println(plan.getDescripcion() + " cuesta $" + plan.getCosto());

        plan = new ConHD(plan);
        System.out.println(plan.getDescripcion() + " cuesta $" + plan.getCosto());

        plan = new ConDescargasOffline(plan);
        System.out.println(plan.getDescripcion() + " cuesta $" + plan.getCosto());
    }
}
