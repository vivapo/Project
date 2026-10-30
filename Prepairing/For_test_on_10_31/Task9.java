package For_test_on_10_31;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите знак");
        String sign = scanner.next();
        while(!sign.equals("=")){
            System.out.println("Введите число");
            int b = scanner.nextInt();
            switch (sign){
                case "+": a+=b; break;
                case "-": a-=b; break;
                case "*": a*=b; break;
                case "/": a/=b; break;
            }
            System.out.println("Введите знак");
            sign = scanner.next();
        }
        System.out.println(a);


    }
}
