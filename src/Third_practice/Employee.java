package Third_practice;

import java.text.DecimalFormat;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        String formattedSalary = new DecimalFormat("#0.00 RUB").format(salary);
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + formattedSalary +
                '}';
    }
}
