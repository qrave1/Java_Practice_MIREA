package Third_practice;

import java.util.ArrayList;
import java.util.Random;

public class Circle {
    private Point center;
    private int r;
    ArrayList<Point> list = new ArrayList<>();

    public Circle(Point center) {
        this.center = center;
        Random rand = new Random();
        this.r = rand.nextInt(100);
    }

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void addPoint(int x, int y) {
        Point obj = new Point(x, y);
        list.add(obj);
    }

    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }
}
