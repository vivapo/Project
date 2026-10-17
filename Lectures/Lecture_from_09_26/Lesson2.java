package Lecture_from_09_26;

import java.util.Scanner;

public class Lesson2{
	public static void main(String[] args){
		int secret = 10;
		int maxcount = 5;
		Scanner in = new Scanner(System.in);
		System.out.println("Введи целое число");
		int num = in.nextInt();
		while(true) {
			--maxcount;
			if(maxcount==0){
				System.out.println("Вы проиграли...");
				break;
			}
			if(num==secret){
				System.out.println("Вы угадали!!!");
				break;
			}
			if(num>secret){
				System.out.println("Секретное число меньше. Введите новое число");
				num = in.nextInt();
			}
			if(num<secret){
				System.out.println("Секретное число больше. Введите новое число");
				num = in.nextInt();
			}


		}
	
		
	}

}