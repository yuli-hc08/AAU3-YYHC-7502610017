package TALLER19.EJERCICIO2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en el disco local: " + contenido);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando '" + nombreArchivo + "' desde el disco local.");
        return "Contenido local de " + nombreArchivo;
    }
}