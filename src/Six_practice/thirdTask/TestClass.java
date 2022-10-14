package Six_practice.thirdTask;

public class TestClass implements Nameable{
    private String name;

    public TestClass(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
