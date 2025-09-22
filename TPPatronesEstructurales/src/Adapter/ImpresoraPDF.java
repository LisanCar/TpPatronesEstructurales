package Adapter;

public class ImpresoraPDF implements Impresora {
    private ImpresoraAdapter impresoraAdapter;

    @Override
    public void imprimir(String tipoImpresion, String documento) {
        if (tipoImpresion.equalsIgnoreCase("PDF")) {
            System.out.println("Imprimiendo documento PDF: " + documento);
        } else {
            impresoraAdapter = new ImpresoraAdapter();
            impresoraAdapter.imprimir(tipoImpresion, documento);
        }
    }
}
