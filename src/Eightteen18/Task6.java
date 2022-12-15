package Eightteen18;

public class Task6 {
    public static void main(String[] args) {
        printMessage(null); // показать 2 вариант с нормальным вводом
    }

    public static void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "Data for " + key;
    }
}

