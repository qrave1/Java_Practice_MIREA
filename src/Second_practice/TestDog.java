package Second_practice;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Dog[] list = new Dog[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dogs");
        int j = sc.nextInt();
        sc.nextLine();
        String tempName;
        int tempAge;
        for(int i = 0; i < j; i++){
            System.out.println("Enter the dog's name");
            tempName = sc.nextLine();
            System.out.println("Enter the dog's age");
            tempAge = sc.nextInt();
            list[i] = new Dog(tempName, tempAge);
            sc.nextLine();
        }
        System.out.println("Age of dog "+ list[0].getName() + " in human counting: " + list[0].toHumanAge());
    }
}
