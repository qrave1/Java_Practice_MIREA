package Second_practice;

public class Bookshelf {
    private int numberOfBooks;
    private Book[] list;

    public Bookshelf(int numberOfBooks, Book[] shelf) {
        this.numberOfBooks = numberOfBooks;
        this.list = shelf;
    }

    public Book[] getList() {
        return list;
    }

    public Book getEarly(Book[] shelf) {
        int min = 3000;
        int tempCount = 0;
        for(int i = 0; i < shelf.length; i++) {
            if (shelf[i].getYear() < min) {
                tempCount = shelf[i].getYear();
            }
        }
        return shelf[tempCount];
    }

    public Book getLate(Book[] shelf) {
        int max = 0;
        int tempCount = 0;
        for(int i = 0; i < shelf.length; i++) {
            if (shelf[i].getYear() > max) {
                tempCount = shelf[i].getYear();
            }
        }
        return shelf[tempCount];
    }} // убрать закрывающую скобку
    // вся еботня с этим методом, надо сделать сортировку короче и класс для тестов
    /*public Bookshelf getSorted() {
        Book[] array = new Book[numberOfBooks];
        for(int i = 0; i < numberOfBooks; i++) {
            array[i] = Bookshelf.getList();
        }
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < Bookshelf.shelf.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}*/
