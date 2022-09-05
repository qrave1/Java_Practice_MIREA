package Second_practice;

public class TestBall {
    public static void main(String[] args) {
        Ball a1 = new Ball(6.3,10.5);
        Ball a2 = new Ball();
        a1.getX();
        a1.getY();
        a1.setX(5.2);
        a1.setY(10);
        a1.move(20,21.1);
        System.out.println(a1.toString());
    }
}
