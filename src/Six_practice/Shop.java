package Six_practice;

public class Shop implements Printable{
    private String product;
    private int price;

    public Shop(String product, int price) {
        this.product = product;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("product: "+product);
        System.out.println("price: "+price);
    }
}
