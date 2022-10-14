package Six_practice.foughtTask;

public class Tester {
    public static void main(String[] args) {
        TestClass car = new TestClass("car",1000000);
        TestClass coffee = new TestClass("coffee",150);
        System.out.println(car.getPrice());
        System.out.println(coffee.getPrice());
    }
}
