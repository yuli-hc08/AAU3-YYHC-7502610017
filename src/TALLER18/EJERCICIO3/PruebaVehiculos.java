package TALLER18.EJERCICIO3;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Conduccion auto = new Automovil("Mazda");
        Camion camion = new Camion("KTR-482");

        auto.conducir();
        camion.conducir();
        camion.cargarMercancia();
    }
}