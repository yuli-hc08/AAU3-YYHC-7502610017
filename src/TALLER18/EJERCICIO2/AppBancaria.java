package TALLER18.EJERCICIO2;

public class AppBancaria implements Transferencia, PagoFactura {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino);
    }

    @Override
    public void pagarFactura(String servicio, double monto) {
        System.out.println("Pago de factura de " + servicio + " por $" + monto);
    }
}