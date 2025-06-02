package coin.exchange.api;

import coin.exchange.model.ExchangeResponse;
import coin.exchange.util.EnvReader;
import coin.exchange.model.RateType;
import coin.exchange.util.ExchangeJsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchCoin {
    private final String baseCoin;
    private final String targetCoin;

    public FetchCoin(RateType baseCoin, RateType targetCoin) {
        this.baseCoin = baseCoin.getCoin();
        this.targetCoin = targetCoin.getCoin();
    }

    public ExchangeResponse fetchToApi() throws IOException, InterruptedException {
        EnvReader env = new EnvReader();
        String apiKey = env.getEnv("API_KEY");

        String url = "https://v6.exchangerate-api.com/v6/" + apiKey +   "/pair/" + baseCoin + "/" + targetCoin;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return ExchangeJsonParser.parseResponse(response.body());
    }
}
