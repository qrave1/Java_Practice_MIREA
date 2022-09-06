package Second_practice;

public class TestSecondCircle {
    public static void main(String[] args) {
        Circle_second_ex obj1 = new Circle_second_ex(10);
        System.out.println(obj1.getLength());
        System.out.println(obj1.getSquare());
        Circle_second_ex obj2 = new Circle_second_ex(5);
        Circle_second_ex obj3 = new Circle_second_ex(15);
        obj1.compare(obj2);
        obj1.compare(obj3);
    }
}
