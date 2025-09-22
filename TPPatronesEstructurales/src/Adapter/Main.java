package Adapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ImpresoraPDF impresora = new ImpresoraPDF();

        impresora.imprimir("PDF", "Documento en PDF");
        impresora.imprimir("Texto", "Documento de texto");
    }
}