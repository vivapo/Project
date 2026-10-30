package For_test_on_10_31;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(natlog(x));
    }

    public static double natlog(double x){
        double nast = 1;
        int sign = 1;
        double eps = 0.00000001;
        int n = 0;
        double sum = 0;
        while(nast*x/(n+1) >= eps){
            nast = nast*x;
            sum += sign*nast/(n+1);
            sign = -1*sign;
            n+=1;
        }
        return sum;
    }


}
