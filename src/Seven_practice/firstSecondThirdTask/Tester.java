package Seven_practice.firstSecondThirdTask;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1,3, 10, 10, 0, 0);
        System.out.println(rectangle.convertToString(12,12));
        System.out.println(rectangle.speedTest());
    }
}
