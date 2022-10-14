package Seven_practice.fifthSixthTask;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line: ");
        String string = sc.nextLine();
        ProcessStrings obj1 = new ProcessStrings(string);
        System.out.println(obj1.count());
        System.out.println(obj1.uneven());
        System.out.println(obj1.inversion());
    }
}
