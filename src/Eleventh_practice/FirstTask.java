package Eleventh_practice;


import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new GregorianCalendar();
        Calendar compareCalendar = new GregorianCalendar();
        Calendar studentCalendar = new GregorianCalendar();
        Date date = new Date();
        String surname = "Smirnov";

        //Дата прошлой недели, когда я получил задание
        calendar.set(2022, 9, 7, 15, 50, 0);
        System.out.println(surname);
        System.out.println(calendar.getTime());
        System.out.println(date);
        //Сравнивание даты введённой пользователем с текущей датой
        //Тут же выполнено и четвёртое задание
        Compare compare = new Compare();
        System.out.println("enter the year: ");
        int year = sc.nextInt();
        System.out.println("enter the mouth: ");
        int month = sc.nextInt();
        System.out.println("enter the day: ");
        int day = sc.nextInt();
        System.out.println("enter the hour: ");
        int hour = sc.nextInt();
        System.out.println("enter the minute: ");
        int minute = sc.nextInt();
        compareCalendar.set(year, month - 1, day, hour, minute);
        compare.compareDate(compareCalendar);

        Student student = new Student();


        //Третье задание, реализовано с помощью метода print
        studentCalendar.set(year, month - 1, day, hour, minute);
        student.setStudentCalendar(studentCalendar);
        System.out.println("what type of date you wanna see: ");
        System.out.println("1 - only year, 2 - years, month and day, 3 - date and time");
        int num = sc.nextInt();
        student.print(num);


        //5 Задание
        System.out.println();
        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        long start = System.nanoTime();
        //Заполнение
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("(ArrayList)(Filling) ms: " + elapsed / 100000);
        //Вставка по индексу
        start = System.nanoTime();
        arrayList.add(5,12);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(ArrayList)(Adding) ms: " + elapsed / 100000);
        //Удаление по индексу
        start = System.nanoTime();
        arrayList.remove(7542);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(ArrayList)(Remove) ms: " + elapsed / 100000);
        //Поиск по индексу
        start = System.nanoTime();
        arrayList.get(9999);
        arrayList.toArray();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(ArrayList)(Find) ms: " + elapsed / 100000);

        System.out.println("\n");

        //Заполнение
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(Linked list)(Filling) ms: " + elapsed / 100000);
        //Вставка по индексу
        start = System.nanoTime();
        linkedList.add(6432,12);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(Linked list)(Add) ms: " + elapsed / 100000);
        //Удаление по индексу
        start = System.nanoTime();
        linkedList.remove(7654);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(Linked list)(Remove) ms: " + elapsed / 100000);
        //Поиск по индексу
        start = System.nanoTime();
        linkedList.get(9999);
        linkedList.toArray();
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("(Linked list)(Find) ms: " + elapsed / 100000);
    }
}
