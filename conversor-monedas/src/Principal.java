import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        ConsultarAPI consulta = new ConsultarAPI();
        int opcion=0;
        while (opcion!= 9){
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"+
                    "Bienvenidos al Conversor de Monedas\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n"+
                    "Ingresa la Opcion de la Conversion que deseas realizar\n\n"+
                    "1.Dolar Estadounidense (USD) a Peso Argentino(ARS)\n"+
                    "2.Peso Argentino(ARS) a Dolar Estadounidense(USD)\n"+
                    "3.Dolar Estadounidense(USD) a Real Brasileño(BRL)\n"+
                    "4.Real Brasileño(BRL) a Dolar Estadounidense(USD)\n"+
                    "5.Dolar Estadounidense(USD) a Peso Colombiano(COP)\n"+
                    "6.Peso Colombiano(COP) a Dolar Estadounidense(USD)\n"+
                    "7.Dolar Estadounidense(USD) a Peso Mexicano(MXN)\n"+
                    "8.Peso Mexicano(MXN) a Dolar Estadounidense(USD)\n"+
                    "9.Salir del Convertidor");

                    opcion=lectura.nextInt();
                    lectura.nextLine();

                    switch (opcion){
                        case 1:
                            ConvertidorMoneda.convertir("USD","ARS",consulta,lectura);
                            break;
                        case 2:
                            ConvertidorMoneda.convertir("ARS","USD",consulta,lectura);
                            break;
                        case 3:
                            ConvertidorMoneda.convertir("USD","BRL",consulta,lectura);
                            break;
                        case 4:
                            ConvertidorMoneda.convertir("BRL","USD",consulta,lectura);
                            break;
                        case 5:
                            ConvertidorMoneda.convertir("USD","COP",consulta,lectura);
                             break;
                        case 6:
                            ConvertidorMoneda.convertir("COP","USD",consulta,lectura);
                            break;
                        case 7:
                            ConvertidorMoneda.convertir("USD","MXN",consulta,lectura);
                            break;
                        case 8:
                            ConvertidorMoneda.convertir("MXN","USD",consulta,lectura);
                            break;
                        case 9:
                            System.out.println("Saliendo del Conversor");
                            break;
                        default:
                            System.out.println("Opcion NO valida");
                            break;
                    }

        }
    }
}
