
public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;	
		for (int i = 1 ; i <= 200 ; i++) {
			if(i%2!=0 && i%3!=0) {
				sum = sum + i;
			}
		}
		System.out.println("총합 : " + sum);
	}
}
