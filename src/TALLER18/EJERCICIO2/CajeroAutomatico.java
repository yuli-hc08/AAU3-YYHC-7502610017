package TALLER18.EJERCICIO2;

public class CajeroAutomatico implements Retiro {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro en cajero por $" + monto);
    }
}