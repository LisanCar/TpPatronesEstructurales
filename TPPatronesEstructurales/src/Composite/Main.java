package Composite;

public class Main {
    public static void main(String[] args) {
        // Crear platos individuales
        Plato ensalada = new Plato("Ensalada César", 6000);
        Plato sopa = new Plato("Sopa del día", 6500);
        Plato pasta = new Plato("Pasta Alfredo", 11000);
        Plato pizza = new Plato("Pizza Margherita", 12000);
        Plato tiramisu = new Plato("Tiramisú", 6000);
        Plato helado = new Plato("Helado artesanal", 5000);

        // Submenú de postres
        Menu menuPostres = new Menu("Menú de Postres");
        menuPostres.agregarElemento(tiramisu);
        menuPostres.agregarElemento(helado);

        // Menú principal del día
        Menu menuDelDia = new Menu("Menú del Día");
        menuDelDia.agregarElemento(ensalada);
        menuDelDia.agregarElemento(sopa);
        menuDelDia.agregarElemento(pasta);
        menuDelDia.agregarElemento(menuPostres); // Agregar el submenú de postres

        // Crear menú especial con pizza
        Menu menuEspecial = new Menu("Menú Pizza Especial"); // 20% descuento
        menuEspecial.agregarElemento(ensalada);
        menuEspecial.agregarElemento(pizza);
        menuEspecial.agregarElemento(helado);

        menuDelDia.mostrar();
        System.out.println("--------------");
        menuEspecial.mostrar();

    }
}
