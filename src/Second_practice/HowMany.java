package Second_practice;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        String[] line;
        String word;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        line = word.split("[\\p{Punct}\\s]+");
        System.out.println(line.length + " words");
    }
}