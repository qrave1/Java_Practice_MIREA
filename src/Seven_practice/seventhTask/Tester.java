package Seven_practice.seventhTask;

public class Tester {
    public static void main(String[] args) {
        Printable[] printable = new Printable[3];

        printable[0] = new Magazine("qwer");
        printable[1] = new Magazine("adsf");
        printable[2] = new Magazine("zxcv");

        Printable obj = new Magazine();

        System.out.println(obj.printMagazines(printable));

    }
}
