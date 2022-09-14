package Third_practice;

import java.text.NumberFormat;
import java.util.*;

public class Online_shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> map = new HashMap<>();
        ArrayList<String> tempList = new ArrayList<>();
        Random rand = new Random();
        double price = 0;
        System.out.println("Enter the index of position");
        while(true) {
            String key = sc.nextLine();
            if(Objects.equals(key, "q"))
                break;
            double value = rand.nextDouble(1000,20000);
            map.put(key, value);
            tempList.add(key);
        }
        for (Object value : map.values()) {
            price += Double.parseDouble(value.toString());
        }
        System.out.println("Select the currency to be paid \n 1) RUB \n 2) USD \n 3) EUR");
        int payment = sc.nextInt();
        switch (payment) {
            case (1) -> System.out.println("Price in RUB: " + price);
            case (2) -> {
                Locale lc = new Locale("us");
                NumberFormat temp = NumberFormat.getCurrencyInstance(lc);
                System.out.println(temp.format(price / 60));
            }
            case (3) -> {
                Locale lc = new Locale("fr");
                NumberFormat temp = NumberFormat.getCurrencyInstance(lc);
                System.out.println(temp.format(price / 61));
            }
        }
    }
}
