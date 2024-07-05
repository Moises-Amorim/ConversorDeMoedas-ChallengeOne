package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();

        System.out.println("Digite USD:");
        var cotacao = leitura.nextLine();


        ConversaoMoeda novaConversao = consultaMoeda.buscaMoeda(cotacao);
        System.out.println(novaConversao);

    }
}
