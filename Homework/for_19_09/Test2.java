public class Test2 {
	public static void main(String[] args){
		System.out.println("-------------------------------------------");
		System.out.println("|var1 |var2 |  &  |  |  |  ^  |  !  |  !  |");
		System.out.println("-------------------------------------------");
		boolean var1 = true;
		boolean var2 = false;
		System.out.println("|"+var1+" |"+var2+"|"+(var1&var2)+"|"+(var1|var2)+" |"+(var1^var2)+" |"+(!var1)+"|"+(!var2)+" |");
		System.out.println("-------------------------------------------");
		var1 = false;
		var2 = true;
		System.out.println("|"+var1+"|"+var2+" |"+(var1&var2)+"|"+(var1|var2)+" |"+(var1^var2)+" |"+(!var1)+" |"+(!var2)+"|");
		System.out.println("-------------------------------------------");
		var1 = true;
		var2 = true;
		System.out.println("|"+var1+" |"+var2+" |"+(var1&var2)+" |"+(var1|var2)+" |"+(var1^var2)+"|"+(!var1)+"|"+(!var2)+"|");
		System.out.println("-------------------------------------------");
		var1 = false;
		var2 = false;	
		System.out.println("|"+var1+"|"+var2+"|"+(var1&var2)+"|"+(var1|var2)+"|"+(var1^var2)+"|"+(!var1)+" |"+(!var2)+" |");
		System.out.println("-------------------------------------------");	
		System.out.println();
		System.out.println();
		System.out.println();





		System.out.println("-------------------------------");
		System.out.println("|var1|var2| & | | | ^ | ! | ! |");
		System.out.println("-------------------------------");
		var1 = true;
		var2 = false;
		System.out.println("|  "+(var1 ? "t":"f")+" |  "+(var2 ? "t":"f")+" | "+((var1&var2)? "t":"f")+" | "+((var1|var2)? "t":"f")+
			" | "+((var1^var2)? "t":"f")+" | "+(!var1 ? "t":"f")+" | "+(!var2 ? "t":"f")+" |");
		var1 = false;
		var2 = true;
		System.out.println("-------------------------------");
		System.out.println("|  "+(var1 ? "t":"f")+" |  "+(var2 ? "t":"f")+" | "+((var1&var2)? "t":"f")+" | "+((var1|var2)? "t":"f")+
			" | "+((var1^var2)? "t":"f")+" | "+(!var1 ? "t":"f")+" | "+(!var2 ? "t":"f")+" |");
		var1 = true;
		var2 = true;
		System.out.println("-------------------------------");
		System.out.println("|  "+(var1 ? "t":"f")+" |  "+(var2 ? "t":"f")+" | "+((var1&var2)? "t":"f")+" | "+((var1|var2)? "t":"f")+
			" | "+((var1^var2)? "t":"f")+" | "+(!var1 ? "t":"f")+" | "+(!var2 ? "t":"f")+" |");
		var1 = false;
		var2 = false;
		System.out.println("-------------------------------");
		System.out.println("|  "+(var1 ? "t":"f")+" |  "+(var2 ? "t":"f")+" | "+((var1&var2)? "t":"f")+" | "+((var1|var2)? "t":"f")+
			" | "+((var1^var2)? "t":"f")+" | "+(!var1 ? "t":"f")+" | "+(!var2 ? "t":"f")+" |");
		System.out.println("-------------------------------");


	}
}