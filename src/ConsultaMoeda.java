package src;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public ConversaoMoeda buscaMoeda(String cotacao) {
        URI url = URI.create(("https://v6.exchangerate-api.com/v6/b9a8484d9242274e1ad1f548/latest/" + cotacao));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ConversaoMoeda.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
