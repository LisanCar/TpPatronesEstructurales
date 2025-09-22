package Adapter;

public class ImpresoraAdapter implements Impresora{
   private ImpresoraTexto impresoraTexto;

    public ImpresoraAdapter() {
        impresoraTexto = new ImpresoraTexto();
    }

    @Override
    public void imprimir(String tipoImpresion, String documento) {
        if (tipoImpresion.equalsIgnoreCase("Texto")) {
            impresoraTexto.imprimirTexto(documento);
        }else {
            System.out.println("Formato no soportado: " + documento);
        }
    }
}
