package Eight_practice;
//Дано натуральное число N. Выведите все его цифры по одной, в обычном
//порядке, разделяя их пробелами или новыми строками.
public class Task14 {
    public static String recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(1234567890)); // вызов рекурсивной функции
    }
}

