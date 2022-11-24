package Eight_practice;
/*Дано число n, десятичная запись которого не содержит нулей. Получите
число, записанное теми же цифрами, но в противоположном порядке.*/

public class Task10 {
    public static int recursion(int num, int tmp){
        int res = tmp*10 + num%10;
        if (num > 10)
            res = recursion(num/10, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(recursion(123456789,0));
    }
}
