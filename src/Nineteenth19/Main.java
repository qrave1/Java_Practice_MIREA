package Nineteenth19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("���1", 67, 12, 18));
        s.add(new Student("���2", 57, 23, 18));
        s.add(new Student("���3", 93, 42, 19));
        s.add(new Student("���4", 24, 2, 18));
        s.add(new Student("���5", 66, 16, 18));

        new LabClassUI(s);
    }
}
