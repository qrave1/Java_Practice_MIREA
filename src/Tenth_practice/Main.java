package Tenth_practice;
//Сортировка с помощью класса Collections - реализуется быстрая сортировка, то есть повторяется прошлое задание
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        students.add(new Student("Artem","Smirnov", "proginj", "IKBO-30-21",2));
        students.add(new Student("qwer","QWER", "proginj", "IKBO-30-21",3));
        students.add(new Student("asdf","ASDF", "proginj", "IKBO-30-21",4));
        students.add(new Student("zxcv","ZXCV", "proginj", "IKBO-30-21",1));
        students.add(new Student("rtyu","TTYU", "proginj", "IKBO-30-21",2));
        students1.add(new Student("Artem","Smirnov", "proginj", "IKBO-30-21",2));
        students1.add(new Student("qwer","QWER", "proginj", "IKBO-30-21",3));
        students1.add(new Student("asdf","ASDF", "proginj", "IKBO-30-21",4));
        students1.add(new Student("zxcv","ZXCV", "proginj", "IKBO-30-21",1));
        students1.add(new Student("rtyu","TTYU", "proginj", "IKBO-30-21",2));


        students2.addAll(students);
        students2.addAll(students1);

        Student student = new Student();

        student.setArray(students);
        student.outArray();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("sorted array");



        Collections.sort(students);
        student.setArray(students);
        student.outArray();
        System.out.println("two arrays:");

        student.setArray(students2);
        student.outArray();
        System.out.println("sorted array");

        Collections.sort(students);
        student.setArray(students);
        student.outArray();
    }
}
