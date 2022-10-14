package Six_practice.tenthTask;

import Fourth_practice.Computer.Monitor;
import Fourth_practice.Computer.Memory;
import Fourth_practice.Computer.Processor;
import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        ArrayList<String> arrayList = new ArrayList<>();

        Shop obj1 = new Shop();
        System.out.println("Enter the number of computer's: ");
        int size = sc.nextInt();
        System.out.println("Enter computer's name: ");
        for (int i = 0; i <= size; i++){
            name = sc.nextLine();
            arrayList.add(name);
        }

        //Передача массива имён компьютера в класс
        obj1.setArr(arrayList);

        System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands, 0 - exit");
        int button = sc.nextInt();
        while(button != 0) {
            if (button == 1) {
                obj1.printArr();
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }

            else if (button == 2) {
                System.out.println("enter the name you want to add: ");
                sc.nextLine();
                name = sc.nextLine();
                obj1.addElement(name);
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }

            else if (button == 3){
                System.out.println("enter the name you want to remove: ");
                sc.nextLine();
                name = sc.nextLine();
                obj1.removeElement(name);
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }

            else if (button == 4){
                System.out.println("enter the name you want to find: ");
                sc.nextLine();
                name = sc.nextLine();
                obj1.findElement(name);
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }
            else if (button == 5){
                System.out.println("There is all computer's brands: ");
                obj1.printBrands();
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }

            else{
                System.out.println("I don't understand, please try again");
                System.out.println("1 - print, 2 - add, 3 - delete, 4 - find, 5 - see computer brands,  0 - exit");
                button = sc.nextInt();
            }
        }
        System.out.println("Do you want to check the computers characteristics. 1 - Yes, 2 - No: ");
        button = sc.nextInt();
        if (button == 1){
            Processor processor = new Processor(3.7);
            Memory memory = new Memory(4.5, 16);
            Monitor monitor = new Monitor(27, 144);

            monitor.turnOn();
            memory.cleaning();
            System.out.println("Frequency of memory is: "+memory.getFrequency());
            System.out.println("AmountOfMemory of memory: "+memory.getAmountOfMemory());
            System.out.println("Monitor size: " + monitor.getSize());
            System.out.println("Monitor Hz: " + monitor.getHz());
            System.out.println("Processor's Ghz: " + processor.getGHz());
        }
    }
}
