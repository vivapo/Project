package For_test_on_10_31;

public class Task1 {
    public static void main(String[] args){
        int[] aray = {1,2,3,4,5,6,7,8,-1,-2,-3,-4};
        System.out.println(sum(aray));
    }
    public static int sum(int[] array){
        int s = 0;
        for(int i = 0; i<array.length; i+=1){
            s+=array[i];
        }
        return s;
    }
}
