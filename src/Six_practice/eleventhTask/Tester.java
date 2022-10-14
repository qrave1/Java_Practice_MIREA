package Six_practice.eleventhTask;
import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Convert convert = new Convert();
        System.out.print("Enter the celsius: ");
        float celsius = sc.nextInt();
        convert.convertKelvin(celsius);
        convert.convertFahrenheit(celsius);
    }
}
