package TALLER18.EJERCICIO1;

public class AuxiliarLimpieza implements Limpieza {
    private String nombre;

    public AuxiliarLimpieza(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void limpiar() {
        System.out.println(nombre + " está limpiando las oficinas.");
    }
}