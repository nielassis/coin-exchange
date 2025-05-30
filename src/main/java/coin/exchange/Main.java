package coin.exchange;

import coin.exchange.model.ExchangeResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        EnvReader env = new EnvReader();
        String api = env.getEnv("API_KEY");

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + api + "/latest/USD"))
                .GET()
                .build();

        try {
            Gson gson = new Gson();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ExchangeResponse exchange = gson.fromJson(response.body(), ExchangeResponse.class);

            System.out.println("Moeda base: " + exchange.getBase_code());
            System.out.println("Cotação do BRL: " + exchange.getRates().get("BRL"));

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}