package Second_practice;

import java.lang.reflect.Array;

public class TestBook {
    public static void main(String[] args) {
        Book[] obj = new Book[10];
        Book obj1 = new Book("Pushkin", "Onegin", 1812);
        Book obj2 = new Book("Dostoevky", "Prestyplenie i nakazanie", 1866);
        Book obj3 = new Book("Marks", "Kapital", 1890);
        obj[0] = obj1;
        obj[1] = obj2;
        obj[2] = obj3;
        Bookshelf shelf = new Bookshelf();
        shelf.setArray(obj);
        shelf.maxYear();
        shelf.minYear();
    }
}
