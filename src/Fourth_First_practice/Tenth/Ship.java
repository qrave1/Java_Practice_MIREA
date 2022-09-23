package Fourth_First_practice.Tenth;

public class Ship extends Vehicle {
    private double time;
    private double price;

    public Ship(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 3);
    }

    public void findTime(){
        System.out.println(time * 6);
    }
}
