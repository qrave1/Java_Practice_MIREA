package Third_practice;

import java.util.Scanner;
import java.util.ArrayList;

public class MainCircle {
    public static void main(String[] args) {
        ArrayList<Circle> tempList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter x");
            int tempX = sc.nextInt();
            System.out.println("Enter y");
            int tempY = sc.nextInt();
            Point tempObj = new Point(tempX, tempY);
            Circle tempObj2 = new Circle(tempObj);
            tempList.add(tempObj2);
        }
        System.out.println(tempList);
        CircleTest obj = new CircleTest(tempList);
        obj.getNumberOfElem();
        System.out.println(obj.findMax());
        System.out.println(obj.findMin());
        System.out.println(obj.SortedList());
    }
}
