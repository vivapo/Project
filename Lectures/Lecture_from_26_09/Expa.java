package Lecture_from_26_09;

public class Expa{
	public static void main(String[] args){
		double x = -1;
		double n1 = 1;
		double n2 = 1;
		double s = n1;
		while ((n1>0.00001)||(n1<-0.00001)){
			s = s+(n1 = n1*(x/n2));
			n2=n2+1;
			System.out.println(s);
		}
		System.out.println(s);

	}
}