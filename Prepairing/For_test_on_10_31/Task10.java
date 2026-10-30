package For_test_on_10_31;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ur = scanner.next();
        // что-то вида а * х^2 +- bx +- с = 0 без пробелов
        int k = 0;// нужный для счёта вхождения иксов счётчик
        int k1 = 0;// номер первого вхождения x
        double a=0;
        double b=0;
        double c=0;
        for(int i = 0; i<ur.length();++i) {
            if (ur.charAt(i) == 'x' && k == 0) {
                k += 1;
                a = Integer.parseInt(ur.substring(0, i));
                k1 = i;
            }
            else if (ur.charAt(i) == 'x' && k == 1) {
                b = Integer.parseInt(ur.substring(k1 + 3, i));
                c = Integer.parseInt(ur.substring(i + 1, (ur.length()-2)));
                break;
            }
        }

        double d = b*b-4*a*c;
        double x1 = 0;
        double x2 = 0;
        if(d>0){
            x1 = (-1*b+Math.sqrt(d))/2/a;
            x2 = (-1*b-Math.sqrt(d))/2/a;
            System.out.println("x1 = "+x1+" x2 = "+x2);
        }else if(d==0){
            x1 =  -1*b/2/a;
            System.out.println("x = "+x1);
        }else{
            x1 = -1*b/2/a;
            System.out.println("x1 = "+x1+"+ "+Math.sqrt(Math.abs(d))/2 + "*i x2 = "+x1+"- "+Math.sqrt(Math.abs(d))/2+"*i");
        }

    }
}
