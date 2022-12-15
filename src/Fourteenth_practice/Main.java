package Fourteenth_practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       Необходимо реализовать консольное приложение, позволяющее
//       манипулировать строкой, разбив ее на элементы путем использования
//       регулярных выражений.
        //Задание 1
        // проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("a*y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);
        // поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "адреса эл.почты: mymail@tut.by и rom@bsu.by";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }
        // разбиение строки на подстроки с применением шаблона в качестве
        // разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("qwer1asdf 77 qwer123zxcv");
        for (String word : words)
            System.out.println(word);


        //Задание 2
        System.out.println("Enter the line:");
        Pattern pattern2 = Pattern.compile("\\w+\\+");
        Matcher matcher2 = pattern2.matcher(sc.nextLine());
        if (matcher2.matches())
            System.out.println("string matches pattern");
        else
            System.out.println("string doesn't matches pattern");

        System.out.println();

        //Задание 3

        String regex3 = "(\\d+\\.\\d{2} (USD|EU|RUB))";
        String string3 = "25.98 USD, 1.21 UA, 48920.11 RUB, 123123.12 EU"; //Это строка с ценами для третьего задания, чтобы не вводить вручную
        System.out.println("Start price list: " + string3);
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher m3 = pattern3.matcher(string3);
        while (m3.find()) {
            System.out.println("Price list: " + m3.group());
        }
        System.out.println();
        //Задание 4
        //необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+»
        ArrayList<String> matches = new ArrayList<>();
        String regex4 = "[0-9]+[ ]*[+]";
        Pattern p4 = Pattern.compile(regex4);
        String string4 = "(1 + 8) – 9 / 4 - 6 / 5 * 2 * 9";
        Matcher m4 = p4.matcher(string4);
        if (m4.find()) {
            matches.add(m4.group());
        }
        System.out.println(matches);
        System.out.println();
        //Задание 5
        System.out.println(checkString("29/02/2004"));
        System.out.println(checkString("30/04/2003"));
        System.out.println(checkString("01/01/2003"));
        System.out.println(checkString("29/02/2001"));
        System.out.println(checkString("30-04-2003"));
        System.out.println(checkString("1/1/1899"));

        System.out.println();
        //Задание 6
        String regex6 = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        String string6 = "smirnov@gmail.com, asdf@mail.ru, as@rumbler.ru, @asdf.eu, .qw@asdf";
        //Это строка с почтами для 6-ого задания, чтобы не вводить вручную
        System.out.println("Start email list: " + string6);
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(string6);
        while (m6.find()) {
            System.out.println("Email list: " + m6.group());
        }
        System.out.println();
    }


    //Задание 5
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$"
    );

    private static boolean checkString(final String dateAsString) {
        Matcher m = DATE_PATTERN.matcher(dateAsString);
        boolean result = m.matches();
        if (result) {
            int day = Integer.parseInt(m.group(1));
            int month = Integer.parseInt(m.group(2));
            int year = Integer.parseInt(m.group(3));
            if (day > 28 && month == 2) {
                result = false;
            }
        }
        return result;
    }
}
