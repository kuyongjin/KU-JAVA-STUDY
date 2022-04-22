
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단을 출력해보자 ... 2단부터 9단까지
		
		for(int left = 2 ; left <= 9 ; left++) {
			if(left != 6 && left != 7) {
				System.out.println(left + "단");
				
				for(int right = 1 ; right <= 9 ; right++) {
					int result = left * right;
					System.out.println(left + "X" + right + "=" + result);	
					}
				}
			}	
	}			
}
