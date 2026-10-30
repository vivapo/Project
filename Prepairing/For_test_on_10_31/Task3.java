package For_test_on_10_31;

import javax.swing.*;

public class Task3 {
    static int[] array = {0,0,0,1,2,3,3,3,4,5,3,6,7,3,5,5,9,1,3,5,6,9,8,3,8,9};
    public static void main(String[] args){
        for(int a: deleteagain(array)){
            System.out.println(a);
        }

    }

    public static int[] deleteagain(int[] array){
        int[] array2 = new int[array.length];
        int k = 0; // номер последнего элемента
        boolean nalnull = false;//наличие нуля
        for(int a: array){
            if((a==0)&&(!nalnull)){
                nalnull = true;
                k+=1;
            }
            for(int j = 0;j<k;++j){
                if(a==array2[j]){
                    break;
                }else if(array2[j]==0){
                    array2[j]=a;
                    k+=1;
                    break;
                }
            }
        }
        int[] array3 = new int[k];
        for(int i=0;i<k;++i){
            array3[i] = array2[i];
        }
        return array3;
    }

}
