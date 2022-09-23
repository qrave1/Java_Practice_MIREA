package Fourth_practice.Shop;

import java.util.Arrays;
import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogs[] catalogs = Catalogs.values();
        System.out.println(Arrays.toString(catalogs));
        System.out.println("choose a category: ");
        String name = sc.nextLine();
        String product = ""; //Продукт возвращаемый в корзину.
        switch (name){
            case "A":
                Accessores[] accessores = Accessores.values();
                System.out.println(Arrays.toString(accessores));
                System.out.println("choose a product: ");
                name = sc.nextLine();
                switch (name){
                    case "C":
                        System.out.println("comb was added to your can");
                        product = "comb";
                        break;

                    case "S":
                        System.out.println("scrunchy was added to your can");
                        product = "scrunchy";
                        break;

                    case "G":
                        System.out.println("glasses was added to your can");
                        product = "glasses";
                        break;

                }
                break;
            case "C":
                Clothes[] clothes = Clothes.values();
                System.out.println(Arrays.toString(clothes));
                System.out.println("choose a product: ");
                name = sc.nextLine();
                switch (name){
                    case "P":
                        System.out.println("pants was added to your can");
                        product = "pants";
                        break;

                    case "S":
                        System.out.println("skirt was added to your can");
                        product = "skirt";
                        break;

                    case "T":
                        System.out.println("tie was added to your can");
                        product = "tie";
                        break;

                }
                break;
            case "P":
                Products[] products = Products.values();
                System.out.println(Arrays.toString(products));
                System.out.println("choose a product: ");
                name = sc.nextLine();
                switch (name){
                    case "B":
                        System.out.println("banana was added to your can");
                        product = "banana";
                        break;

                    case "A":
                        System.out.println("apple was added to your can");
                        product = "apple";
                        break;

                    case "C":
                        System.out.println("cheese was added to your can");
                        product = "cheese";
                        break;

                }
                break;

            default:
                System.out.println("you entered the wrong name.");
                break;
        }
        System.out.println("in your shopping cart only " + product.toUpperCase() + ", do you want to buy it?");
        System.out.println("1 - Yes, 2 - No");
        int choise = sc.nextInt();
        if (choise == 1){
            System.out.println("thanks for using our shop.");
        }
        else{
            System.out.println("ok, good bye.");
        }
    }
}
