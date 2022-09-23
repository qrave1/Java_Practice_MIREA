package Fourth_First_practice.Ninth;

public class Chair extends Furniture{
    @Override
    public String toString() {
        return "Chair\n" +
                "price = " + getPrice() +
                ", comfortRate = " + getComfortRate();
    };
}
