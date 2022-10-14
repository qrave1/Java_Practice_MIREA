package Seven_practice.fourthTask;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double x, int degree) {
        for (int i = 0; i < degree - 1; i++){
            x *= x;
        }
        return x;
    }

    @Override
    public double fabs(double x) {
        if(x < 0){
            x *= -1;
            return x;
        }
        else
            return x;
    }

    @Override
    public double getPI() {
        return 3.14;
    }
}
