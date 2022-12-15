package Eightteen18;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println(2.0 / 0.0); // 0 это не int
        System.out.println(0D / 0); // оба операнда double
        try {
            System.out.println(2 / 0); // 0 это int
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
