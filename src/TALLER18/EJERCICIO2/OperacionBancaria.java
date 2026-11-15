package TALLER18.EJERCICIO2;

// Interfaz general antes de separar las operaciones
public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(String servicio, double monto);
}