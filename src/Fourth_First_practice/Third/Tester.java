package Fourth_First_practice.Third;

public class Tester {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.talk();
        obj1.move();
        obj1.setAge(16);
        obj1.setFullName("Nick");
        System.out.println(obj1.toString());
        System.out.println();
        Person obj2 = new Person("Alex", 18);
        obj2.talk();
        obj2.move();
        System.out.println(obj2.toString());
    }
}
