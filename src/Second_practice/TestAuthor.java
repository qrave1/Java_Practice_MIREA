package Second_practice;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Vladimir", "Mayakovsky@mail.ru", 'M');
        a1.getEmail();
        a1.getName();
        a1.setEmail("Lenin@google.com");
        System.out.println(a1.toString());
    }
}
