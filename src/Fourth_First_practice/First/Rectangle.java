package Fourth_First_practice.First;

public class Rectangle extends Shape {
    private String type = "Rectangle";
    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    public double getPerimetr() {
        return 2 * firstSide + 2 * secondSide;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Rectangle " +
                "type='" + type + '\'' +
                ", firstSide = " + firstSide +
                ", secondSide = " + secondSide;
    }
}
