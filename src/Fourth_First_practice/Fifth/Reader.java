package Fourth_First_practice.Fifth;

public class Reader {
    private int number; // Номер читательского билета
    private int faculty;
    private int date;
    private int phoneNumber;
    private String name;
    private String bookname;

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }

    public Reader(String name) {
        this.name = name;
    }

    public void takeBook(){
        System.out.println(name + " took " + bookname);
    }

    public void returnBook(){
        System.out.println(name + " returned " + bookname);
    }

    public void takeBook(int books){
        System.out.println(name + " took " + books + " books.");
    }

    public void returnBook(int books){
        System.out.println(name + " returned " + books + " books.");
    }
    public void takeBook(String bookname){
        System.out.println(name + " took " + bookname + ".");
    }


    public void returnBook(String bookname){
            System.out.println(name + " returned " + bookname + ".");
    }
}
