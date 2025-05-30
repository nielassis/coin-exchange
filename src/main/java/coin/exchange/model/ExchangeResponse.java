package coin.exchange.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ExchangeResponse {
    private String status;

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("conversion_rates")
    private Map<String, Double> rates;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBase_code() {
        return baseCode;
    }

    public void setBase_code(String base_code) {
        this.baseCode = base_code;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
