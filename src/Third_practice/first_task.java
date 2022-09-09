package Third_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import static java.lang.Math.random;

public class first_task {
    //Создать массив вещественных чисел случайным образом, вывести его
    //на экран, отсортировать его, и снова вывести на экран (использовать два
    //подхода к генерации случайных чисел – метод random() класса Math и класс Random)
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        Random rand = new Random();
        for(int i=0; i<100;i++) {
            list1.add(i, random());
        }
        for (int i = 0; i < 100; i++) {
            list2.add(i, rand.nextDouble());
        }
        System.out.println(list1 + "\n");
        System.out.println(list2 + "\n");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1 + "\n");
        System.out.println(list2);
    }
}
