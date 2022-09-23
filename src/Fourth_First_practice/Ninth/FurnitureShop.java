package Fourth_First_practice.Ninth;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("in out shop available: ");
        System.out.println("1 - Sofa, 2 - Bed, 3 - Chair");
        int num = sc.nextInt();
        if (num == 1){
            System.out.println("you chose sofa, there is their characteristics: ");
            Sofa sofa = new Sofa();
            sofa.setPrice(13000);
            sofa.setComfortRate(7);
            System.out.println(sofa.toString());
        }
        else if (num == 2){
            System.out.println("you chose bed, there is their characteristics: ");
            Bed bed = new Bed();
            bed.setPrice(20000);
            bed.setComfortRate(10);
            System.out.println(bed.toString());
        }
        else if (num == 3){
            System.out.println("you chose chair, there is their characteristics: ");
            Chair chair = new Chair();
            chair.setPrice(1500);
            chair.setComfortRate(3);
            System.out.println(chair.toString());
        }
    }
}
