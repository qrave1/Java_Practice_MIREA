package Nine_practice;

public class AllTask {
    public static void main(String[] args) {
        Student[] students1 = new Student[5];
        students1[0] = new Student(5,3,"qwer");
        students1[1] = new Student(12,5,"asdf");
        students1[2] = new Student(1,2,"zxcv");
        students1[3] = new Student(65,4,"tyui");
        students1[4] = new Student(14,1,"hjkl");
        Student[] students2 = new Student[5];
        students2[0] = new Student(6,6,"qwer");
        students2[1] = new Student(14,8,"asdf");
        students2[2] = new Student(3,10,"zxcv");
        students2[3] = new Student(56,9,"tyui");
        students2[4] = new Student(41,7,"hjkl");

        //Сортировка вставками
        System.out.println("Before sortId(Insertion sort):");
        for (int i = 0; i < students1.length; i++){
            System.out.println(students1[i].toString());
        }
        Student test = new Student();

        test.sortId(students1);

        System.out.println("After sortId(Insertion sort):");
        for (int i = 0; i < students1.length; i++){
            System.out.println(students1[i].toString());
        }


        System.out.println();


        //Быстрая сортировка
        System.out.println("Before sortGrade(quickSort):");
        for (int i = 0; i < students2.length; i++){
            System.out.println(students2[i].toString());
        }

        test.quickSort(students2,0,4);
        System.out.println("After sortGrade(quickSort):");
        for (int i = 0; i < students2.length; i++){
            System.out.println(students2[i].toString());
        }


        System.out.println();
        System.out.println();


        Student[] student3 = new Student[10];
        student3 = test.slianie(students1,students2);
        System.out.println("arrays before MergeSort");
        for(int i = 0; i < 10; i++){
            System.out.println(student3[i].toString());
        }
        test.mergeSort(student3);
        System.out.println("arrays after MergeSort");
        for(int i = 0 ; i < student3.length; i++)
            System.out.println(student3[i].toString());
    }
}
