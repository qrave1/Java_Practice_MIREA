package Second_practice;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop DNS = new Shop("Проспект Вернадского 78");
        System.out.println("Enter the number of computers");
        int compNumber = sc.nextInt();
        int tempId;
        String tempCPU, tempGPU, tempMEM;
        for(int i=0; i < compNumber; i++){
            System.out.println("Enter the ID");
            tempId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the CPU");
            tempCPU = sc.nextLine();
            System.out.println("Enter the GPU");
            tempGPU = sc.nextLine();
            System.out.println("Enter the MEM");
            tempMEM = sc.nextLine();
            DNS.storage[i] = new Computer(tempId, tempCPU, tempGPU, tempMEM);
            if(i+1!=compNumber)
                System.out.println("\nNext computer\n");
            else
                System.out.println("The end of filling :)");
        }
        DNS.search(15);
    }
}
