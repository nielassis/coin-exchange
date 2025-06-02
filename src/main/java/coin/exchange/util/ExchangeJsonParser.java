package coin.exchange.util;

import com.google.gson.Gson;
import coin.exchange.model.ExchangeResponse;

public class ExchangeJsonParser {

    private static final Gson gson = new Gson();

    public static ExchangeResponse parseResponse(String json) {
        return gson.fromJson(json, ExchangeResponse.class);
    }
}
