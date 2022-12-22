package first_practice;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;

        }while(i < arr.length);

        int max = arr[0];
        int min = arr[0];
        i = 0;

        do{
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }while(i < arr.length);
        System.out.println("Sum: "+sum);
        System.out.println("min: "+max);
        System.out.println("max: "+min);
    }
}
