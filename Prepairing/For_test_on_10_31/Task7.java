package For_test_on_10_31;

public class Task7 {
    static int num = 9;
    static int[] array = new int[num+1];

    public static void main(String[] args) {
        T(num);
        for(int a:array){
            System.out.println(a);
        }
    }
    public static void T(int n){
        if(n==0){
            array[0] = 1;
        }else{
            T(n-1);
            array[n]=n*array[n-1];
        }


    }
}
