public class expa {
    public static void main(String[] args) {
        System.out.println(fun( new int[] {1, 2, 8, 4, 5},8));
    }

    public static int fun(int[] array, int b) {
        for (int i = 0; i<array.length; ++i){
            if (array[i]==b){
                return i+1;
            }
        }
        return -1;
    }
//    public static double exp(double x){
//        double e = 1+x;
//        double epsilon = 1e-6;
//        double s = x;
//        int n = 2;
//        while ((s>epsilon)||(s < -epsilon)){
//            s = s*x/(n++);
//            e = e+s;
//        }
//        return e;
//    }
//    public static double sin(double x){
//        int i = 1;
//        int n = 10;
//        double sin = x;
//        int z = -1;
//        double s = x;
//        while (i<n){
//            s = s*x*x/(2*i)/(2*i+1);
//            sin = sin + z*s;
//            ++i;
//            z = -1*z;
//        }
//        return sin;
//    }


}
