package lab26;

import java.util.HashMap;
import java.util.Map;

public class HashTab<T, V> {
    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Косматов Александр Юрьевич");
        passportsAndNames.put(162348, "Смирнов Артём Евгеньевич");
        passportsAndNames.put(8082771, "Карпов Дмитрий Анатольевич");

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

    }
}
