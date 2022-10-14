package Seven_practice.eightTask;

public class Tester {
    public static void main(String[] args) {
        Printable[] printable = new Printable[3];

        printable[0] = new Book("qwer");
        printable[1] = new Book("adsf");
        printable[2] = new Book("zxcv");

        Printable obj = new Book();

        System.out.println(obj instanceof Printable);

        System.out.println();

        System.out.println(obj.printMagazines(printable));

    }
}