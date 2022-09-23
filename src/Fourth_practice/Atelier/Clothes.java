package Fourth_practice.Atelier;


public abstract class Clothes{
    private int cost;
    private Studio size;
    private String colour;
    private String name;


    public Clothes() {
    }

    public Clothes(Studio size, int price, String color, String name) {
        this.size = size;
        this.cost = price;
        this.colour = color;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public Studio getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public abstract String go();

    @Override
    public String toString() {
        return "Clothing " + "sizeClothing = " + size + ", priceClothing = " + cost + ", colorClothing = " + colour + ", name = " + name;
    }
}
