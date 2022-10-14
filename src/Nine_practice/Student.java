package Nine_practice;

import java.util.*;

class Student implements Comparator<Student> {
    private int id;
    private int grade;
    private String name;

    public Student() {
    }

    public Student(int id, int grade, String name) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }


    //Сортировка вставками
    public void sortId(Student arr[]) {
        for (int left = 0; left < arr.length; left++) {
            // Вытаскиваем значение элемента
            int value = arr[left].getId();
            String name = arr[left].getName();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr[i].getId()) {
                    arr[i + 1].id = arr[i].id;
                    arr[i + 1].name = arr[i].name;
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arr[i + 1].id = value;
            arr[i + 1].name = name;
        }
    }


    //Быстрая сортировка
    public void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].getGrade();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getGrade() < opora) {
                i++;
            }

            while (array[j].getGrade() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i].getGrade();
                array[i].grade = array[j].getGrade();
                array[j].grade = temp;
                int id = array[i].getId();
                array[i].id = array[j].getId();
                array[j].id = id;
                String name = array[i].getName();
                array[i].name = array[j].getName();
                array[j].name = name;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public void mergeSort(Student arr[]) {
        for (int left = 0; left < arr.length; left++) {
            // Вытаскиваем значение элемента
            int value = arr[left].getId();
            String name = arr[left].getName();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr[i].getId()) {
                    arr[i + 1].id = arr[i].id;
                    arr[i + 1].name = arr[i].name;
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            arr[i + 1].id = value;
            arr[i + 1].name = name;
        }
    }



    public Student[] slianie(Student[] students1, Student[] students2) {
        Student[] students3 = new Student[students1.length + students2.length];

        for (int i = 0; i < (students1.length); i++) {
            students3[i] = students1[i];
            students3[5 + i] = students2[i];
        }
        return students3;
    }


    public void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < l.length; i++){
            l[i] = a[i];
        }
        for (int i = 0; i < r.length; i++){
            r[i] = a[i];
        }

        for (int i = 0; i < mid; i++) {
            l[i].id = a[i].getId();
        }
        for (int i = mid; i < n; i++) {
            r[i - mid].id = a[i].getId();
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].id <= r[j].id) {
                a[k++].id = l[i++].getId();
            }
            else {
                a[k++].id = r[j++].getId();
            }
        }
        while (i < left) {
            a[k++].id = l[i++].getId();
        }
        while (j < right) {
            a[k++].id = r[j++].getId();
        }
    }


    @Override
    public String toString() {
        return "Student " +
                "id = " + id +
                ", grade = " + grade +
                ", name = '" + name + '\'';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
        //Метод compare также возвращает числовое значение - если оно отрицательное,
        //то объект o1 предшествует объекту o2, иначе - наоборот. А если метод возвращает ноль, то объекты равны.
    }
}
