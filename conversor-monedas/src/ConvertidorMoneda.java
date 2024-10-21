import java.util.Scanner;

public class ConvertidorMoneda {
    public static void convertir(String monedaOrigen, String monedaDestino, ConsultarAPI consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas= consulta.buscarMoneda(monedaOrigen, monedaDestino);
        System.out.println("Taza de Conversion\n "+monedaOrigen+"="+monedas.conversion_rate()+" "+monedaDestino);
        System.out.println("Ingrese la Cantidad de "+monedaOrigen);
        cantidad=Double.parseDouble(lectura.nextLine());
        cantidadConvertida= cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaOrigen+" "+ String.format("%.2f",cantidadConvertida)+" "+monedas.target_code());
    }
}

