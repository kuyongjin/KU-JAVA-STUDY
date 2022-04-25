
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 합을 구해보자
		
		int sum = 0;
		
		for(int i = 1 ; i <= 100 ; i++ ) {
		sum += i;
				
		}
		System.out.println("총합 : " + sum);
	
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%3==0) {
				continue;
				
			}	
			
		}
	}
}
