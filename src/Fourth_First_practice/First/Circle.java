package Fourth_First_practice.First;

public class Circle extends Shape {
    private String type = "Circle";
    private final double PI = 3.14;
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    public double getPerimetr() {
        return PI * 2 * r;
    }

    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Circle " +
                "type = '" + type + '\'' +
                ", PI = " + PI +
                ", r = " + r;
    }
}
