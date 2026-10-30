package For_test_on_10_31;

public class Task2 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        double[] b = strangeFunct(array);
        for(double z:b){
            System.out.println(" " + z);
        }
    }
    public static double[] strangeFunct(int[] array){
        double[] array2 = new double[array.length];
        double max = array[0];
        for(int a:array){
            if(max<a){
                max=a;
            }
        }
        for(int i = 0;i<array.length;++i){
            array2[i]= (double)(array[i]) / max;
        }
        return array2;
    }
}
