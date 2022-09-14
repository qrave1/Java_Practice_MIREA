package Third_practice;

public class First_Wrappers {
    public static void main(String[] args) {
        Double a = Double.valueOf(5);
        Double b = Double.valueOf("55");
        System.out.println("1) "+ a + "\n" +b);
        double c = Double.parseDouble("10");
        System.out.println("2) " + c);
        Double d = 4.0;
        d = Double.parseDouble(String.valueOf(d));
        System.out.println("3) " +d);
        double e;
        String s = Double.toString(3.14);
        e = Double.parseDouble(s); // TODO: почему не valueOf()?
        System.out.println("4) "+ e);
    }
}
