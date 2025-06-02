package coin.exchange.model;

public enum RateType {
    BRL("BRL"),
    USD("USD"),
    HRK("HRK"),
    GBP("GBP"),
    EUR("EUR");

    public String coin;

    RateType(String m) {
        coin = m;
    }

    public String getCoin() {
        return coin;
    }
}