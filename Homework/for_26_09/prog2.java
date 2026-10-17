public class prog2 {
	public static void main(String[] args){
		int x = 1;
		int y = 3;
		int z;
		char c1 = 'a';
		char c2 = 'b';
		boolean b = false;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("b = "+b);
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println();


		System.out.println("c1++ = "+ c1++);
		c1 = 'a';
		System.out.println("(z = c2 - c1++) is "+ (z = c2 - c1++));
		c1 = 'a';
		System.out.println("b = (z = c2 - c1++) == 1 ^ true is "+ ((z = c2 - c1++) == 1 ^ true));
		System.out.println();


		System.out.println("(x++ - --y) is " + (x++ - --y));
		System.out.println("(x-- + --y) is " + (x-- + --y));
		x = 1;
		y = 3;
		System.out.println("(x++ - --y) * (x-- + --y) == 0 is "+ ((x++ - --y) * (x-- + --y) == 0));
		y = 3;
		System.out.println("z = "+ z);
		System.out.println("!(z == 2) is "+ !(z == 2));
		System.out.println("(x++ - --y) * (x-- + --y) == 0 || !(z == 2) is "+ ((x++ - --y) * (x-- + --y) == 0 || !(z == 2)));
		System.out.println();



		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		System.out.println("++x % y - z * 2 is "+ (++x % y - z * 2));
		x = 1;
		System.out.println("++x % y - z * 2 & 0b00001011 is "+ (++x % y - z * 2 & 0b00001011));
	}
}