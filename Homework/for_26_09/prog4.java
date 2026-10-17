public class prog4{
	public static void main(String[] args){
		int n = 100;
		int k = 0;
		for(int i = 2; i<n; ++i){
			k = 0;
			for(int j = 2; j<=(i/2); ++j){
				if(i%j==0){
					++k;
				}
			}
			if(k==0){
				System.out.println(""+i+" - является простым числом");
			}
			
		}
	}
}