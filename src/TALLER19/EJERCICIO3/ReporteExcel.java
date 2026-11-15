package TALLER19.EJERCICIO3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en Excel con los datos: " + datos);
    }
}