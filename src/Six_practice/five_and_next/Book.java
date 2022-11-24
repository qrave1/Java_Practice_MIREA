package Six_practice.five_and_next;

public class Book implements Printable{
    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("bookName: "+bookName);
        System.out.println("author: "+author);
    }
}
