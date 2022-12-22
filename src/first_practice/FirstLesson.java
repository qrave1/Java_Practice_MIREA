package first_practice;

public class FirstLesson {
    public static void main(String[] args) {
        int[] arr = {1,2,7,5,3,8,10,4,12,14};
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avarage = sum / arr.length;
        System.out.println("sum: " +sum);
        System.out.println("avarage: " +avarage);
    }
}
