package Fourth_First_practice.Tenth;

public class Train extends Vehicle {
    private double time;
    private double price;

    public Train(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 1.5);
    }

    public void findTime(){
        System.out.println(time * 10);
    }
}
