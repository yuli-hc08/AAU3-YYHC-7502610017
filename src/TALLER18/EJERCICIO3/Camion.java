package TALLER18.EJERCICIO3;

public class Camion implements Conduccion, TransporteMercancia {
    private String placa;

    public Camion(String placa) {
        this.placa = placa;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión de placas " + placa + ".");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión " + placa + ".");
    }
}