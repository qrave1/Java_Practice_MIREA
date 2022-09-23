package Fourth_First_practice.Third;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move(){
        System.out.println("some person is coming");
    }

    public void talk(){
        System.out.println("some person is talking");
    }

    @Override
    public String toString() {
        return "Person " +
                "fullName = '" + fullName + '\'' +
                ", age = " + age;
    }
}
