package Fourth_First_practice.Ninth;

public abstract class Furniture {
    private double price;
    private double comfortRate;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComfortRate(double comfortRate) {
        this.comfortRate = comfortRate;
    }

    public double getPrice() {
        return price;
    }

    public double getComfortRate() {
        return comfortRate;
    }

    @Override
    public String toString() {
        return "Furniture " +
                "price = " + price +
                ", comfortRate = " + comfortRate;
    }
}
