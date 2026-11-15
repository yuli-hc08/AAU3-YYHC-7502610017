package TALLER19.EJERCICIO2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Subiendo '" + nombreArchivo + "' a la nube: " + contenido);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Descargando '" + nombreArchivo + "' desde la nube.");
        return "Contenido en la nube de " + nombreArchivo;
    }
}