package src;
import java.util.Map;

public class ConversaoCotacao {
    private String resultado;
    private Map<String, Double> conversion_rates;

    public String getResultado() {
        return resultado;
    }

    public double getCotacao(String cotacao) {
        return conversion_rates.get(cotacao);
    }

}
