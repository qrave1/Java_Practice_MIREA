package Fourth_First_practice.Tenth;

public class Auto extends Vehicle {
    private double time;
    private double price;

    public Auto(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 2);
    }

    public void findTime(){
        System.out.println(time * 8);
    }
}
