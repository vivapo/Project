package for_09_26;

public class prog5{
	public static void main(String[] args){
		int n = 16;
		int l = 10;//сколько раз прогонять
		double p = 0;//конечный результат
		double k = 1;
		for(int i = 1;i<=l;++i){
			if(i==1){
				while(((p+1)*(p+1))<=n){
					p = p + 1;
				}
			}
			if(i!=1){
				k = k/10;
				while(((p+k)*(p+k))<=n){
					p = p + k;
				}
			}
		}
	System.out.println(p);
	}
}