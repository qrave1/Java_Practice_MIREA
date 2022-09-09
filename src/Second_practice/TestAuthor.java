package Second_practice;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vladimir", "Mayakovsky@mail.ru", 'M');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("Lenin@google.com");
        System.out.println(a1);
    }
}
