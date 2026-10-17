import java.util.Scanner;
import java.util.Random;

public class CrossZero{
	public static void main(String[] args){
		int fill = 0; // заполненность ячеек
		int value = 0; // значения ячеек
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		int row = 0;
		int col = 0;





		while(true){

			//ход игрока
			System.out.println("Введите номер строки от 1 до 3");
			row = in.nextInt();
			System.out.println("Введите номер столбца от 1 до 3");
			col = in.nextInt();
			System.out.println();


			//проверка на занятость места, и если оно свободно, то занимание этого места
			int shift = row*3-col;
			int a = 1 << shift;
			if ((fill&a)==a){
				System.out.println("Это место уже занято. Попробуйте ещё раз"); //если уже занята эта ячейка
				System.out.println();
				continue;
			}
			fill = fill | a; //если не занята эта ячейка
			value = value | a;



			//вывод поля после хода игрока
			System.out.println("Ход игрока:");
			for (row = 1; row<=3;row++){
				for(col = 1; col<=3; col++){
					shift = row*3-col;
					char c = '_';
					int mask = 1 << shift;
					if ((fill&mask) > 0) { 
						if ((value&mask) > 0){
							c = 'X';
						} else{
							c = '0';
						}
					} else{
						c = '_';
					}
					System.out.print(c);
				}
				System.out.println();
			}
			System.out.println();




			//проверка на то, победил игрок или нет
			int maskwin1 = 0b111000000;
			if(((maskwin1 & fill) == maskwin1) & ((maskwin1 & value) == maskwin1)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin2 = 0b000111000;
			if(((maskwin2 & fill) == maskwin2) & ((maskwin2 & value) == maskwin2)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin3 = 0b000000111;
			if(((maskwin3 & fill) == maskwin3) & ((maskwin3 & value) == maskwin3)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin4 = 0b100100100;
			if(((maskwin4 & fill) == maskwin4) & ((maskwin4 & value) == maskwin4)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin5 = 0b010010010;
			if(((maskwin5 & fill) == maskwin5) & ((maskwin5 & value) == maskwin5)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin6 = 0b001001001;
			if(((maskwin6 & fill) == maskwin6) & ((maskwin6 & value) == maskwin6)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin7 = 0b100010001;
			if(((maskwin7 & fill) == maskwin7) & ((maskwin7 & value) == maskwin7)){
				System.out.println("Вы победили!!!");
				break;
			}
			int maskwin8 = 0b001010100;
			if(((maskwin8 & fill) == maskwin8) & ((maskwin8 & value) == maskwin8)){
				System.out.println("Вы победили!!!");
				break;
			}



			//ход робота
			System.out.println("Ход робота:");
			while (true){
				int randomstep = random.nextInt(9);
				if (((1<<randomstep)&fill)==0) {
					fill = fill | (1<<randomstep);
					break;
				}
			}
	



			//вывод поля после хода робота
			for (row = 1; row<=3;row++){
				for(col = 1; col<=3; col++){
					shift = row*3-col;
					char c = ' ';
					int mask = 1 << shift;
					if ((fill&mask) > 0) { 
						if ((value&mask) > 0){
							c = 'X';
						} else{
							c = '0';
						}
					} else{
						c = '_';
					}
					System.out.print(c);
				}
				System.out.println();
			}
			System.out.println();




			//проверка на то, победил робот или нет
			if(((maskwin1 & fill) == maskwin1) & ((maskwin1 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin2 & fill) == maskwin2) & ((maskwin2 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin3 & fill) == maskwin3) & ((maskwin3 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin4 & fill) == maskwin4) & ((maskwin4 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin5 & fill) == maskwin5) & ((maskwin5 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin6 & fill) == maskwin6) & ((maskwin6 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin7 & fill) == maskwin7) & ((maskwin7 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
			if(((maskwin8 & fill) == maskwin8) & ((maskwin8 & value) == 0)){
				System.out.println("Вы проиграли...");
				break;
			}
		}
		




	}
}