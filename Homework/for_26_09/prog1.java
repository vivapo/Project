public class prog1 {
	public static void main(String[] args){
        // boolean b;
        // float x = 1;
        // float y = 10;
        // float z = 0.1f; // f делает из вещественного double в float. в дабл 64 бита, в флот 32 бита. Именно поэтому выдавало false. Потому что, x/y 
        // //это float, а 0.1 это double
        // b = ((x/y) == z);
        // System.out.println("x/y == 0.1 is " + b);
        // System.out.println(x/y == 0.1);


        int n = 97;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println("c1 != c2 is "+ (c1 != c2));
        System.out.println("c1 > c2 is "+ (c1 > c2));
        System.out.println("c1 < c2 is "+ (c1 < c2));
        System.out.println("c1 == c2 - 1 is "+ (c1 == c2 - 1));
        System.out.println("c2 > n is "+ (c2 > n));
        System.out.println("c1 == 'a' is "+ (c1 == 'a'));
        System.out.println("c1 == n is "+ (c1 == n));
        System.out.println("c2 - c1 == 1 is "+ (c2 - c1 == 1));
        System.out.println();

        int m = 64;
        int r;
        System.out.println("m=64");
        System.out.println("r = m << 1; r = "+ (m << 1));
        System.out.println("r = m << 2; r = "+ (m << 2));
        System.out.println("r = m << 3; r = "+ (m << 3));
        System.out.println("r = m >> 1; r = "+ (m >> 1));



	}
}