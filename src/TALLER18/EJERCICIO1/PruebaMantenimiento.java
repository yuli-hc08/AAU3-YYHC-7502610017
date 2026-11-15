package TALLER18.EJERCICIO1;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Reparacion tecnico = new Tecnico("Carlos");
        Limpieza auxiliar = new AuxiliarLimpieza("Marta");

        tecnico.reparar();
        auxiliar.limpiar();
    }
}