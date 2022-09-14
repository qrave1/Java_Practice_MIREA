package Third_practice;

import java.util.ArrayList;
import java.util.Random;

public class ReportTest {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Employee> tempList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tempList.add(new Employee("A"+i, rand.nextDouble(10000,20000)));
        }
        Report MIREAreport = new Report(tempList);
        MIREAreport.generateReport();
    }
}
