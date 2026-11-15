package TALLER18.EJERCICIO1;

public class Tecnico implements Reparacion {
    private String nombre;

    public Tecnico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reparar() {
        System.out.println(nombre + " está realizando una reparación eléctrica.");
    }
}