package Third_practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    ArrayList<Employee> list = new ArrayList<>();

    public Report(ArrayList<Employee> list) {
        this.list = list;
    }

    public void generateReport() {
        for (Employee emp : list) {
            String temp = emp.toString();
            System.out.format("%5s%n", temp);

        }
    }
}
