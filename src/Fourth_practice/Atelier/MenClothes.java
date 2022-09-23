package Fourth_practice.Atelier;

public abstract class MenClothes extends Clothes {

    public MenClothes(Studio sizeClothing, int priceClothing, String colorClothing, String name) {
        super(sizeClothing, priceClothing, colorClothing, name);
    }

    @Override
    public String go(){
        return "men wears " + getName() + "\n";
    }
}
