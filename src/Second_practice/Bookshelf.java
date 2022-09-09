package Second_practice;


public class Bookshelf {
    private Book[] array = new Book[3];

    public void setArray(Book array[]) {
        this.array = array;
    }

    public void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].getAuthor());
            System.out.println(array[i].getName());
            System.out.println(array[i].getYear());
            System.out.println();
        }
        System.out.println("array lenght: " + array.length);
    }

    public void minYear() {
        int minYear = array[0].getYear();
        for (int i = 0; i < 3; i++) {
            if (array[i].getYear() < minYear) {
                minYear = array[i].getYear();
            }
        }
        System.out.println("min year: " + minYear);
    }

    public void maxYear() {
        int maxYear = array[0].getYear();
        for (int i = 0; i < 3; i++) {
            if (array[i].getYear() > maxYear) {
                maxYear = array[i].getYear();
            }
        }
        System.out.println("max year: " + maxYear);
    }

}

