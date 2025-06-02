package coin.exchange;

import coin.exchange.api.FetchCoin;
import coin.exchange.model.ExchangeResponse;
import coin.exchange.model.RateType;
import coin.exchange.util.CurrencyConverter;
import coin.exchange.view.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int option;

        do {
            option = menu.showMenu();
            if (option >= 1 && option <= 4) {
                double amount = menu.readAmount();

                RateType base = null;
                RateType target = null;

                switch (option) {
                    case 1:
                        base = RateType.BRL;
                        target = RateType.USD;
                        break;
                    case 2:
                        base = RateType.USD;
                        target = RateType.BRL;
                        break;
                    case 3:
                        base = RateType.BRL;
                        target = RateType.EUR;
                        break;
                    case 4:
                        base = RateType.EUR;
                        target = RateType.BRL;
                        break;
                }


                try {
                    FetchCoin fetcher = new FetchCoin(base, target);
                    ExchangeResponse response = fetcher.fetchToApi();

                    double rate = response.getConversionRate();
                    double convertedAmount = amount * rate;
                    String formatted = CurrencyConverter.format(target.getCoin(), convertedAmount);

                    System.out.println("Valor Convertido: " + formatted);
                } catch (Exception e) {
                    System.out.println("Erro no FETCH: " + e.getMessage());
                }
            } else if (option != 5) {
                System.out.println("Opção ínvalida, tente novamente");
            }
        } while (option != 5);

        menu.closeScanner();
        System.out.println("Programa Finalizado.");
    }
}
