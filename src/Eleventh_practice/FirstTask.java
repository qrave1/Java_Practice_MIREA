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
        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        long start = System.nanoTime();
        //Заполнение
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        //Вставка по индексу
        arrayList.add(5,12);
        //Удаление по индексу
        arrayList.remove(3);
        //Поиск по индексу
        arrayList.get(8);
        arrayList.toArray();
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("(ArrayList) ms: " + elapsed / 100000);

        long startList = System.nanoTime();
        //Заполнение
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        //Вставка по индексу
        linkedList.add(5,12);
        //Удаление по индексу
        linkedList.remove(3);
        //Поиск по индексу
        linkedList.get(8);
        linkedList.toArray();
        long finishList = System.nanoTime();
        long elapsedList = finishList - startList;
        System.out.println("(Linked list) ms: " + elapsedList / 100000);
    }
}
