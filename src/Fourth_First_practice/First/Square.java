package Fourth_First_practice.First;

public class Square extends Shape {
    private String type = "Square";
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSquare() {
        return Math.pow(side, 2);
    }

    public double getSPerimetr() {
        return side * 4;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Square " +
                "type = '" + type + '\'' +
                ", side = " + side;
    }
}
