package Fourth_First_practice.Seventh;

public class Tester {
    public static void main(String[] args) {
        Learner[] array = new Learner[3];
        array[0] = new Learner("Tom", 19);
        array[1] = new Learner("Bob", 22);
        array[2] = new Learner("Alex", 18);
        System.out.println("array of Learners: ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Age: " + array[i].getAge());
            System.out.println("Name: " + array[i].getName());
            System.out.println();
        }
        Student student = new Student("Peter", 21);
        System.out.println("Student: ");
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println();
        SchoolBoy schoolBoy = new SchoolBoy("Mick", 17);
        System.out.println("SchoolBoy: ");
        System.out.println(schoolBoy.getAge());
        System.out.println(schoolBoy.getName());
    }
}
