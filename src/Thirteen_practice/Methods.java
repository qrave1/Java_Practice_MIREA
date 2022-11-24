package Thirteen_practice;

import java.util.StringTokenizer;

public class Methods {
    public void firstTask(String string) {
        System.out.println(string.charAt(string.length() - 1));

        //3 Пункт
        if (string.endsWith("!!!")){
            System.out.println("Yes !!!");
        }
        else{
            System.out.println("No !!!");
        }
        //4 Пункт
        if (string.startsWith("I like")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //5 Пункт
        if (string.contains("Java")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("Index of Java: "+string.indexOf("Java"));
        System.out.println(string.replace('a','o'));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(7));
    }
    //Адрес
    public void thirdTask(String string, char symb){
        StringTokenizer st = new StringTokenizer(string, "=.");
        while(st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + symb + val);
        }
    }
    public void fifthTask(String string){
        if (string.startsWith("+")){
            if (string.length() == 13){
                System.out.println(string.substring(0,1) + '<' + string.substring(1,3) + '>'
                        + '<' + string.substring(3,6) + '>' + '-'
                        + '<' + string.substring(6,9) + '>' + '-'
                        + '<' + string.substring(9,13) + '>');
            }
            else{
                System.out.println(string.substring(0,1) + '<' + string.substring(1,2) + '>'
                + '<' + string.substring(2,5) + '>' + '-'
                + '<' + string.substring(5,8) + '>' + '-'
                + '<' + string.substring(8,12) + '>');
            }
        }
        else{
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('+');
            string = string.replaceFirst("8","7");
            stringBuilder.append(string);
            System.out.println(stringBuilder.substring(0,1) + '<' + stringBuilder.substring(1,2) + '>'
                    + '<' + stringBuilder.substring(2,5) + '>' + '-'
                    + '<' + stringBuilder.substring(5,8) + '>' + '-'
                    + '<' + stringBuilder.substring(8,12) + '>');
        }
    }
}
