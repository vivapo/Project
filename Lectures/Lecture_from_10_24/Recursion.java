package Lecture_from_10_24;

public class Recursion {
    public static void main(String[] args){
        int n = 10;
        System.out.println(funct(n));
        }

    public static int arsum(int n, int d, int f){
        if(n == 1){
            return f;
        }
        return arsum(n-1,d,f) +d*(n-1)+f;
    }

    public static int gesum(int n, int dif, int first){
        if(n==1){
            return first;
        }
        return gesum(n-1, dif, first) + (int)Math.pow(dif,(n-1))*first;
    }

    public static int funct(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return 3*funct(n-1)-5*funct(n-2);
    }
}


