import java.util.Scanner;

public class CrossZero2 {
	public static void main(String[] args){
		int fill = 0; // храним в каждом бите факт заполненности поля (0/1)
		int value = 0; // храним в каждлм бите чем заполнили (0/1)
		Scanner in = new Scanner(System.in);

		int row = 0;
		int col = 0;
		/*
			
			x 0 _
			_ 0 x
			x 0 _
			     3 3 3 2 2 2 1 1 1 
			fill 1 1 0 0 1 1 1 1 0
		   value 1 0 0 0 0 1 1 0 0




		*/
		while(true){
			System.out.println("Введите номер строки от 1 до 3");
			row = in.nextInt();
			System.out.println("Введите номер столбца от 1 до 3");
			col = in.nextInt();


			int shift = row*3-col;


			int a = 1 << shift;
			fill = fill | a;
			value = value | a;

			for (row = 1; row<=3;row++){
				for(col = 1; col<=3; col++){
					shift = row*3-col;
					char c = ' ';
					int mask = 1 << shift;
					if ((fill&mask) > 0) { 
						if ((value&mask) > 0){
							c = 'X';
						} else{
							c = 0;
						}
					} else{
						c = '_';
					}
					System.out.print(c);
				}
				System.out.println();
			}


			for (int shiftrobota = 1;shiftrobota<=8;shiftrobota++){
				if (((1<<shiftrobota)&fill)==0) {
					fill = fill | (1<<shiftrobota);
					break;
				}
			}

						for (row = 1; row<=3;row++){
				for(col = 1; col<=3; col++){
					shift = row*3-col;
					char c = ' ';
					int mask = 1 << shift;
					if ((fill&mask) > 0) { 
						if ((value&mask) > 0){
							c = 'X';
						} else{
							c = 0;
						}
					} else{
						c = '_';
					}
					System.out.print(c);
				}
				System.out.println();
			}

		}
		




	}
}