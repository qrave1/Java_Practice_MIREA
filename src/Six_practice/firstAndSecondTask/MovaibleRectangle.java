package Six_practice.firstAndSecondTask;

public class MovaibleRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovaibleRectangle(int x, int y, int xSpeed, int ySpeed, MovablePoint topLeft, MovablePoint bottomRight) {
        super(x, y, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean speedTest(){
        if (xSpeed == ySpeed){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MovaibleRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
