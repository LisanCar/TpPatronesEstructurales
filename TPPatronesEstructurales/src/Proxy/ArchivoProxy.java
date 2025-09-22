package Proxy;

public class ArchivoProxy implements Archivo{
    private String nombreArchivo;
    private ArchivoReal archivoReal;
    private String usuario;

    public ArchivoProxy(String nombreArchivo, String usuario) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
    }

    private boolean tienePermisos() {
        return "admin".equals(usuario) || "usuario_autorizado".equals(usuario);
    }


    @Override
    public void abrir() {
        if (!tienePermisos()) {
            System.out.println("ACCESO DENEGADO: El usuario '" + usuario + "' no tiene permisos para abrir: " + nombreArchivo);
            return;
        }

        if (archivoReal == null) {
            archivoReal = new ArchivoReal(nombreArchivo); // se crea solo si tiene permisos
        }
        archivoReal.abrir();
    }

    @Override
    public void leer() {
        if (!tienePermisos()) {
            System.out.println("ACCESO DENEGADO: El usuario '" + usuario + "' no tiene permisos para leer: " + nombreArchivo);
            return;
        }

        if (archivoReal == null) {
            archivoReal = new ArchivoReal(nombreArchivo);
        }
        archivoReal.leer();
    }
}
