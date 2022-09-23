package Fourth_First_practice.Eighth;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return "Square {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", Area = " + getArea() +
                ", Perimeter = " +getPerimeter()+
                '}';
    }

}
