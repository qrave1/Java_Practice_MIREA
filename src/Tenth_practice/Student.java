package Tenth_practice;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String speciality;
    private String group;
    private int course;
    private ArrayList<Student> students;

    public Student() {
    }

    public Student(String name, String surname, String speciality, String group, int course) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.group = group;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setArray(ArrayList<Student> students) {
        this.students = students;
    }

    public void outArray() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Surname: " + students.get(i).getSurname());
            System.out.println("Speciality: " + students.get(i).getSpeciality());
            System.out.println("Group: " + students.get(i).getGroup());
            System.out.println("Course: " + students.get(i).getCourse());
            System.out.println();
        }
    }

    public void selectionSort(Comparable[] student) {
        int min;
        Comparable temp;
        for (int index = 0; index < student.length - 1; index++) {

            min = index;

            for (int scan = index + 1; scan < student.length; scan++)
                if (student[scan].compareTo(student[min]) < 0)

                    min = scan;
            temp = student[min];

            student[min] = student[index];
            student[index] = temp;

        }

    }


    @Override
    public int compareTo(Student o) {
        return this.getCourse() - o.getCourse();
    }
}