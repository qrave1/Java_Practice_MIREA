package Fourth_First_practice.Sixth;

public class Manager extends Employer{
    private String firstName;
    private String lastName;
    private double income; // ЗП
    private double averageSum; // Средняя сумма дополнительных выплат с продаж

    public void setIncome(double income) {
        this.income = income;
    }

    public void setAverageSum(double averageSum) {
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income + averageSum;
    }
}
