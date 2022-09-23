package Fourth_First_practice.Fourth;

public class Matrix {
    private int[][] arr = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };

    private int[][] arr1 = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };
    private int[][] arr2 = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
    };

    public void printMatrix(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addition(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }
    }
    public void printAdditionalMatrix(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplication(int num){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                arr2[i][j] = arr[i][j] * num;
            }
        }
    }
    public void printMultiplicationMatrix(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
