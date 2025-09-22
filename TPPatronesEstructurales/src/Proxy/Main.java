package Proxy;

public class Main {
    public static void main(String[] args) {
        // Creamos proxies para diferentes usuarios
        Archivo archivo1 = new ArchivoProxy("documento.txt", "admin");
        Archivo archivo2 = new ArchivoProxy("datos.txt", "usuario_autorizado");
        Archivo archivo3 = new ArchivoProxy("archivo.txt", "invitado");

        // Usuario admin - tiene permisos
        System.out.println("\n--- Usuario admin ---");
        archivo1.abrir();
        archivo1.leer();

        // Usuario user1 - tiene permisos
        System.out.println("\n--- Usuario user1 ---");
        archivo2.abrir();
        archivo2.leer();

        // Usuario invitado - NO tiene permisos
        System.out.println("\n--- Usuario invitado ---");
        archivo3.abrir();
        archivo3.leer();
    }
}
