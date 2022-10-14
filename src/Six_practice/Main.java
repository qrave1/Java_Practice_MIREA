package Six_practice;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "joanne rowling");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The fight club", "Chuck Palahniuk");

        Printable[] array = new Printable[3];

        array[0] = book1;
        array[1] = book2;
        array[2] = book3;

        for (Printable printable : array) {
            printable.print();
        }
    }
}
