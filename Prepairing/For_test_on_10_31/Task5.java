package For_test_on_10_31;
import java.util.Scanner;

public class Task5 {
    static int[][] positionsOfFigures = {
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0}

    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию чёрного короля, белого короля, ладьи, слона через пробел");
        String[] positions = scanner.nextLine().split(" ");
        int[] pbq = funct(positions[0]);
        int[] pwq = funct(positions[1]);
        int[] pl = funct(positions[2]);
        int[] ps = funct(positions[3]);



    }

//    public static void situation(int[][] pole,int[] pbq, int[]pwq, int[]pl, int[]ps){
//        if((pwq[0]==1
//
//        }
//
//    }







    public static int[] funct(String pos){
        int posrow = 0;
        char a = pos.charAt(0);
        char b = pos.charAt(1);
        switch (a){
            case 'a':
                posrow = 1;
                break;
            case 'b':
                posrow = 2;
                break;
            case 'c':
                posrow = 3;
                break;
            case 'd':
                posrow = 4;
                break;
            case 'e':
                posrow = 5;
                break;
            case 'f':
                posrow = 6;
                break;
            case 'g':
                posrow = 7;
                break;
            case 'h':
                posrow = 8;
                break;
        }
        int[] res = {posrow,(int)(b-'0')};
        return res;
    }



}
