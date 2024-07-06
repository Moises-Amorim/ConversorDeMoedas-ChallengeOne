package src;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoedaApi {

    public ConversaoCotacao getConversaoCotacao(String moeda) {
        URI url = URI.create(("https://v6.exchangerate-api.com/v6/b9a8484d9242274e1ad1f548/latest/" + moeda));

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), ConversaoCotacao.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
