package Third_practice;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    private final double currencyRUB = 1;
    private double money;
    private double currencyUSD;
    private double currencyEUR;

    public Converter(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public String getCurrencyUSD() {
        Locale loc = new Locale("us");
        NumberFormat temp = NumberFormat.getCurrencyInstance(loc);
        return temp.format(this.money / 60);
    }

    public String getCurrencyEUR() {
        Locale loc = new Locale("fr");
        NumberFormat temp = NumberFormat.getCurrencyInstance(loc);
        return temp.format(this.money / 61);
    }

    @Override
    public String toString() {
        return "Converter{" +
                "currencyUSD=" + currencyUSD +
                ", currencyEUR=" + currencyEUR +
                '}';
    }
}
