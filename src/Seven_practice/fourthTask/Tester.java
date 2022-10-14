package Seven_practice.fourthTask;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathFunc obj1 = new MathFunc();
        System.out.println("Enter the circle radius to calculate the lenght: ");
        double r = sc.nextDouble();
        //Вычисление длины окружности
        System.out.println();
        System.out.println("The circle lenght: " + 2 * r * obj1.getPI());
        System.out.println("Enter the number of the module you would like to receive: ");
        double number = sc.nextDouble();
        System.out.println(obj1.fabs(number));
        System.out.println("Enter the number and the degree: ");
        sc.nextLine();
        number = sc.nextDouble();
        int degree = sc.nextInt();
        System.out.println(obj1.pow(number,degree));
    }
}
