package Fourth_First_practice.Ninth;

public class Sofa extends Furniture{
    @Override
    public String toString() {
        return "Sofa\n" +
                "price = " + getPrice() +
                ", comfortRate = " + getComfortRate();
    };
}
