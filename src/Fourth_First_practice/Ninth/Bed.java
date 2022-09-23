package Fourth_First_practice.Ninth;

public class Bed extends Furniture{
    @Override
    public String toString() {
        return "Bed\n" +
                "price = " + getPrice() +
                ", comfortRate = " + getComfortRate();
    };
}
