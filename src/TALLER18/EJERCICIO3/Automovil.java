package TALLER18.EJERCICIO3;

public class Automovil implements Conduccion {
    private String marca;

    public Automovil(String marca) {
        this.marca = marca;
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil " + marca + ".");
    }
}