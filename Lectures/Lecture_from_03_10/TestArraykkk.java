public class TestArraykkk{
    public static void main(String[] args){

//         int[] a = {2,31,31,5,66,787,10};
//         int maxx = a[0];
//         int minn = a[0];
//         double summ = 0;
//         double med;
//         for(int i = 0; i< a.length;++i) {
//         	if(maxx<a[i]){
//         		maxx = a[i];
//         	if(minn>a[i]){
//         		minn = a[i];
//         	}
//         	summ = summ+a[i];
//         	}
//         	System.out.println(a[i]);
//         }
//
//         System.out.println("\u001B[38;2;255;0;0m");
//         System.out.println("Минимальное значение - "+minn);
//         System.out.println("\u001B[0m");
//         System.out.println("\u001B[38;2;0;255;0m");
//         System.out.println("Максимальное значение - "+maxx);
//         System.out.println("\u001B[0m");
//         med = summ/a.length;
//         System.out.println("\u001B[38;2;0;0;255m");
//         System.out.println("Среднее значение - "+med);
//         System.out.println("\u001B[0m");
//
//        int[] a = {10,2,3,0};
//        int[] b = {-6,3,4,5};
//        int scp = a[0]*b[0]+a[1]+b[1];
//        System.out.print("Сумма векторов -");
//        for(int i = 0;i<a.length;++i){
//            System.out.print(" "+(a[i]+b[i]));
//        }
//        System.out.println();
//        for(int i = 0;i<a.length;++i){
//            scp = a[i]*b[i]+scp;
//        }
//        System.out.println("Скалярное произведение - "+scp);


         int a[] = {1,2,3};
         int b[] = {1,2,3};
         int[] c = new int[(a.length+b.length)];
         for(int i = 0;i<c.length;++i){
         	if (i<a.length){
         		c[i]=a[i];
         	}else{
                c[i]=b[i-a.length];
            }
         	System.out.println(c[i]);
         }




    }
}