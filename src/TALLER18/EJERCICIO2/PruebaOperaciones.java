package TALLER18.EJERCICIO2;

public class PruebaOperaciones {
    public static void main(String[] args) {
        Retiro cajero = new CajeroAutomatico();
        AppBancaria app = new AppBancaria();

        cajero.retirar(200000);
        app.transferir(150000, "301-458920-11");
        app.pagarFactura("Energía", 95000);
    }
}