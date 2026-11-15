package TALLER19.EJERCICIO1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public void autenticar(String usuario) {
        System.out.println("Autenticando al usuario " + usuario + " en la base de datos local.");
    }
}