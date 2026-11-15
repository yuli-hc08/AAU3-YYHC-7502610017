package TALLER19.EJERCICIO1;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(local);
        gestor.iniciarSesion("yuliana");

        ServicioAutenticacion oauth = new AutenticacionOAuth();
        gestor = new GestorAutenticacion(oauth);
        gestor.iniciarSesion("yuliana@correo.com");
    }
}