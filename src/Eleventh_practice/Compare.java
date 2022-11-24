package Eleventh_practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Compare {
    Calendar calendar = new GregorianCalendar();
    public void compareDate(Calendar compareCalendar){
        if(calendar.before(compareCalendar)){
            System.out.println("currently less than entered");
        }
        else if(calendar.after(compareCalendar)){
            System.out.println("currently more than entered");
        }
        else{
            System.out.println("dates are equal");
        }
    }
}
