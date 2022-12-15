package Thirteen_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        Methods test = new Methods();
        test.firstTask("I like Java!!");
        System.out.println('\n');
        //Задание 2
        for (String fio : sc.nextLine().split(" ")) {//Считываем, пока не нажмём enter
            stringBuilder.append(Character.toUpperCase(fio.charAt(0)) + fio.substring(1)).append(' ');
        }
        System.out.println(stringBuilder.toString()+'\n');
        //Задание 4
        Shirt shirt[] = new Shirt[11];
        String shirts[] = new String[11];
        shirts[0] = "S001, Black Polo Shirt, Black,XL";
        shirts[1] = "S002, Black Polo Shirt, Black,L";
        shirts[2] = "S003, Blue Polo Shirt, Blue,XL";
        shirts[3] = "S004, Blue Polo Shirt, Blue,M";
        shirts[4] = "S005, Tan Polo Shirt, Tan,XL";
        shirts[5] = "S006, Black T-Shirt, Black,XL";
        shirts[6] = "S007, White T-Shirt, White,XL";
        shirts[7] = "S008, White T-Shirt, White,L";
        shirts[8] = "S009, Green T-Shirt, Green,S";
        shirts[9] = "S010, Orange T-Shirt, Orange,S";
        shirts[10] = "S011, Maroon Polo Shirt, Maroon,S";
        for (int i = 0; i < 11; i++) {
            shirt[i] = new Shirt();
            shirt[i].setName(shirts[i].substring(0,4));
            int indexType = shirts[i].indexOf("Shirt");
            int lastIndex = shirts[i].lastIndexOf(',');
            shirt[i].setType(shirts[i].substring(6,indexType+5));
            shirt[i].setColor(shirts[i].substring(indexType+7,lastIndex));
            shirt[i].setSize(shirts[i].substring(lastIndex+1));
            System.out.println(shirt[i].toString() + '\n');
        }
        //Задание 5

        test.fifthTask("+79187975114");
        test.fifthTask("+101237561264");
        test.fifthTask("89187975114");


    }
}
