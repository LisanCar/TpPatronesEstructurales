package Proxy;

import Flyweight.Arbol;

public class ArchivoReal implements Archivo {
    private String nombreArchivo;

    public ArchivoReal(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        cargarArchivo();
    }

    private void cargarArchivo(){
        System.out.println("Cargando archivo desde disco: " + nombreArchivo);
    }


    @Override
    public void abrir() {
        System.out.println("Abriendo archivo: " + nombreArchivo);
    }

    @Override
    public void leer() {
        System.out.println("Leyendo contenido del archivo: " + nombreArchivo);
    }
}
