package TALLER19.EJERCICIO3;

public class PruebaReportes {
    public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestor = new GestorReportes(pdf);
        gestor.crearReporte("Ventas del mes de noviembre");

        GeneradorReporte excel = new ReporteExcel();
        gestor = new GestorReportes(excel);
        gestor.crearReporte("Inventario actualizado");
    }
}