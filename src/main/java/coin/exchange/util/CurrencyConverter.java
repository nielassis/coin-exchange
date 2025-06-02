package coin.exchange.util;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<String, Locale> LOCALES = Map.of(
            "BRL", new Locale("pt", "BR"),
            "USD", Locale.US,
            "EUR", Locale.FRANCE
    );

    public static String format(String currencyCode, double amount) {
        Locale locale = LOCALES.getOrDefault(currencyCode, Locale.ROOT);
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }
}
