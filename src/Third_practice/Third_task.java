package Third_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Third_task {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] list = new int[4];
        for (int i = 0; i < 4; i++) {
            int temp = rand.nextInt(10,99);
            list[i] = temp;
        }
        System.out.println(Arrays.toString(list));
        boolean Flag = true;
        for (int i = 1; i < 4; i++) {
            Flag = list[i-1] < list[i];
            if(!Flag) {
                System.out.println("list isn't only growing");
                break;
            }
        }
        if(Flag)
            System.out.println("list is only growing");
    }
}
