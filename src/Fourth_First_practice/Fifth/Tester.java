package Fourth_First_practice.Fifth;

public class Tester {
    public static void main(String[] args) {
        Reader[] array = new Reader[3];
        array[0] = new Reader("Alex");
        array[0].takeBook(3);
        array[0].returnBook(3);
        System.out.println();
        array[1] = new Reader("Tom");
        array[1].takeBook("1984");
        array[1].returnBook("1984");
        System.out.println();
        array[2] = new Reader("Nick");
        array[2].setBookname("Harry Potter");
        array[2].getBookname();
        array[2].takeBook();
        array[2].returnBook();
    }
}
