package Six_practice.foughtTask;

public class TestClass implements Priceable{
    private String name;
    private int price;

    public TestClass(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
