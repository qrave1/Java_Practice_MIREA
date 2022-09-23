package Fourth_First_practice.Eighth;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", Area = " + getArea() +
                ", Perimeter = " +getPerimeter()+
                '}';
    }
}
