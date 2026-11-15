package TALLER19.EJERCICIO2;

public class PruebaArchivos {
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestor = new GestorArchivos(local);
        gestor.guardar("notas.txt", "Taller 19 de POO");
        gestor.abrir("notas.txt");

        Almacenamiento nube = new AlmacenamientoNube();
        gestor = new GestorArchivos(nube);
        gestor.guardar("proyecto.pdf", "Entrega final");
        gestor.abrir("proyecto.pdf");
    }
}