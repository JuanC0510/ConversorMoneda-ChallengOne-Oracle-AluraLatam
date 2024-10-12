import java.util.Scanner;

public class ConversionMoneda {
    public static void convertir(String monedaBase, String monedaTarget, BuscarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        TiposDeMonedas tiposDeMonedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+ " = "+ tiposDeMonedas.conversion_rate()+"  "+ monedaTarget);
        System.out.println("Ingrese la cantidad " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * tiposDeMonedas.conversion_rate();
        System.out.println(cantidad+"  "+monedaBase +" = " +cantidadConvertida + " " + tiposDeMonedas.target_code());
    }
}
