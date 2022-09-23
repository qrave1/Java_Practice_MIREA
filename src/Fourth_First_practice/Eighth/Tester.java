package Fourth_First_practice.Eighth;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle("Green", true, 3);
        System.out.println(circle.toString());
        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setWidth(4);
        rectangle.setLenght(5);
        System.out.println(rectangle.toString());
        System.out.println();
        Square square = new Square("Red", true, 10);
        System.out.println(square.toString());
    }
}
