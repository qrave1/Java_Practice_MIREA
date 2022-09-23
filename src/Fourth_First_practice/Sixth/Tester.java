package Fourth_First_practice.Sixth;

public class Tester {
    public static void main(String[] args) {
        Employer[] array = new Employer[3];
        Employer obj1 = new Manager();
        Employer obj2 = new Employer();
        Manager obj3 = new Manager();
        obj1.setIncome(100000);
        obj2.setIncome(120000);
        obj3.setIncome(100000);
        obj3.setAverageSum(25500);
        array[0] = obj1;
        array[1] = obj2;
        array[2] = obj3;
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i].getIncome());
        }
    }
}
