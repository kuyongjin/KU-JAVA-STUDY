
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 : 1부터 1000 사이의 값 중 7과 8의 배수를 제외한 합을 구해보자
	 
		
		int sum = 0;
		for(int i = 1 ; i <= 1000 ; i++) {
			if(i%7!=0 && i%8!=0) {
				sum += i;
			}
			System.out.println("i: " + i);
		}
	System.out.println(sum);
	}
}
