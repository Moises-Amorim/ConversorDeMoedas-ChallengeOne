package src;

import java.util.ArrayList;
import java.util.List;

public class ConverterMoeda {
    private ConsultaMoedaApi consulta = new ConsultaMoedaApi();
    private List<String> historico = new ArrayList<>();

    public void converter(String deMoeda, String paraMoeda, double quantia) {
        ConversaoCotacao cotacoes =  consulta.getConversaoCotacao(deMoeda);
        double cotacao = cotacoes.getCotacao(paraMoeda);
        double resultado = quantia * cotacao;
        String conversao = String.format("%.2f %s = %.2f %s%n", quantia, deMoeda, resultado, paraMoeda);

        historico.add(conversao);

        System.out.println(conversao);
    }

    public void printHistorico() {
        System.out.println("Histórico de conversões:");
        for (String item : historico) {
            System.out.println(item);
        }
    }
}
