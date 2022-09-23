package Fourth_First_practice.Tenth;

public class Tester {
    public static void main(String[] args) {
        Auto auto = new Auto(1,5000);
        System.out.println("Auto");
        auto.findTime();
        auto.findPrice();
        System.out.println();
        Plane plane = new Plane(1,5000);
        System.out.println("Plane");
        plane.findTime();
        plane.findPrice();
        System.out.println();
        Train train = new Train(1,5000);
        System.out.println("Train");
        train.findTime();
        train.findPrice();
        System.out.println();
        Ship ship = new Ship(1,5000);
        System.out.println("Ship");
        ship.findTime();
        ship.findPrice();
        System.out.println();
    }
}
