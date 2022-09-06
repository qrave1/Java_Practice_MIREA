package Second_practice;

public class Circle_second_ex {
    private int r;
    private final double PI = 3.14;

    public Circle_second_ex(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLength() {
        return 2*PI*r;
    }

    public double getSquare() {
        return PI*r*r;
    }

    public void compare(Circle_second_ex obj) {
        if (obj.r > this.r)
            System.out.println("The second circle is larger");
        else if (obj.r == this.r)
            System.out.println("The circles are equal");
        else
            System.out.println("The second circle is smaller");
    }
}
