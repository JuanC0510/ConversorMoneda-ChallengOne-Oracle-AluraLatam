import java.util.Scanner;

public class ConversorAPPprincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BuscarMoneda Buscar = new BuscarMoneda();
        int opcion = 0;
        while (opcion != 7) {
            String titulo = """
                    \nBIENVENIDOS, CONVERSOR DE MONEDAS
                      CHALLENG ALURA LATAM - ORACLE
                    """;
            System.out.println("***********************************************");
            String menu = """
                1 - Convertir Dollar a peso Argentino
                2 - Convertir peso Argentino a Dollar
                3 - Convertir Dollar a Real Brasileño
                4 - Convertir Real Brasileño a Dollar
                5 - Convertir Dollar a peso Colombiano
                6 - Convertir Peso Colombiano a Dollar
                7 - Salir
                **********************************************
                """;
            System.out.println(titulo);
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConversionMoneda.convertir( "USD",  "ARS", Buscar, teclado);
                    break;
                case 2:
                    ConversionMoneda.convertir("ARS", "USD", Buscar, teclado );
                    break;
                case 3:
                    ConversionMoneda.convertir("USD", "BRL", Buscar, teclado);
                    break;
                case 4:
                    ConversionMoneda.convertir("BRL", "USD", Buscar, teclado);
                    break;
                case 5:
                    ConversionMoneda.convertir("USD", "COP", Buscar, teclado);
                    break;
                case 6:
                    ConversionMoneda.convertir("COP", "USD", Buscar, teclado);
                    break;
                case 7:
                    System.out.println("Saliendo del conversor");
                    break;
                default:
                    System.out.println("Opcion no válida, por favor ingrese un numero del 1 al 7.");
                }

            }teclado.close();
        }

    }
