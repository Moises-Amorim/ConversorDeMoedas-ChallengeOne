package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConverterMoeda converter = new ConverterMoeda();

        while (true) {
            System.out.println("Conversor de Moedas");
            System.out.println("Escolha a conversão que deseja fazer:");
            System.out.println("1 - Converter BRL (Real Brasileiro) para USD (Dólar Americano)");
            System.out.println("2 - Converter USD (Dólar Americano) para BRL (Real Brasileiro)");
            System.out.println("3 - Converter USD (Dólar Americano) para ARS (Peso Argentino)");
            System.out.println("4 - Converter USD (Dólar Americano) para BOB (Boliviano Boliviano)");
            System.out.println("5 - Converter USD (Dólar Americano) para CLP (Peso Chileno)");
            System.out.println("6 - Converter USD (Dólar Americano) para COP (Peso Colombiano)");
            System.out.println("7 - Ver historico de conversoes");
            System.out.println("0 - Sair");
            int escolha = leitura.nextInt();
            leitura.nextLine();

            if (escolha == 0) {
                break;
            } else if (escolha == 7) {
                converter.printHistorico();
                continue;
            }

            System.out.println("Digite o valor: ");
            double quantia = leitura.nextDouble();

            switch (escolha) {
                case 1:
                    converter.converter("BRL", "USD", quantia);
                    break;
                case 2:
                    converter.converter("USD", "BRL", quantia);
                    break;
                case 3:
                    converter.converter("USD", "ARS", quantia);
                    break;
                case 4:
                    converter.converter("USD", "BOB", quantia);
                    break;
                case 5:
                    converter.converter("USD", "CLP", quantia);
                    break;
                case 6:
                    converter.converter("USD", "COP", quantia);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
