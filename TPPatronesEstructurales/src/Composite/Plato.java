package Composite;

public class Plato implements ElementoMenu {
    String nombrePlato;
    double precioPlato;

    public Plato(String nombrePlato, double precioPlato) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }


    @Override
    public void mostrar() {
        System.out.println("Plato: " + nombrePlato + ", $: " + precioPlato);
    }

    @Override
    public double getPrecio() {
        return precioPlato;
    }
}
