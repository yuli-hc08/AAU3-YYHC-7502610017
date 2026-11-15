package TALLER19.EJERCICIO1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public void autenticar(String usuario) {
        System.out.println("Autenticando al usuario " + usuario + " mediante proveedor OAuth.");
    }
}