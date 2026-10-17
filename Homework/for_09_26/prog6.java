package for_09_26;

public class prog6{
	public static void main(String[] args){
		int n = 30;
		String s = "";
		for(int x = -30;x<=30;++x){
			for(int y = -30;y<=30;++y){
				if((x*x + y*y) <= n*n){
					s = s+"**";
				}
				if((x*x + y*y)>n*n){
					s = s+"  ";
				}
			}
			System.out.println(s);
			s = "";
		}
		
		
	}
}