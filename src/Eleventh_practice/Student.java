package Eleventh_practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    String name;
    int yearOfBirth;
    int monthOfBirth;
    int dayOfBirth;
    Calendar studentCalendar = new GregorianCalendar();

    public void setStudentCalendar(Calendar studentCalendar) {
        this.studentCalendar = studentCalendar;
    }
    public void print(){
        System.out.println(studentCalendar.getTime());
    }


    void print(int num){
        if (num == 1){
            System.out.println("Year of birth: "+studentCalendar.get(Calendar.YEAR));
        }
        else if (num == 2){
            System.out.println("Year of birth: "+studentCalendar.get(Calendar.YEAR));
            System.out.println("Month of birth: "+studentCalendar.get(Calendar.MONTH));
            System.out.println("Day of birth: "+studentCalendar.get(Calendar.DAY_OF_MONTH));
        }
        else if (num == 3){
            System.out.println(studentCalendar.getTime());
        }
    }
}
