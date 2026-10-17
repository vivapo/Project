package for_10_17;

public class Selection_sort {

    public static void main(String[] args) {
        int[] a = new int[]{11, 52, 1, 5, 89, 3, 30, 31 }; //sdsddsd
        int[] b = sort(a);
        System.out.print("{ ");
        for(int i = 0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }
        System.out.print("}");
    }

    public static int[] sort(int[] array){
        int index = 0;
        int lastel;
        for(int i = array.length;i>0;--i){
            for(int j = 0;j<i;++j){
                if (array[index]<=array[j]){
                    index = j;
                }
            }
            lastel = array[i-1];
            array[i-1] = array[index];
            array[index]=lastel;
            index = 0;
        }
        return array;
    }

}

