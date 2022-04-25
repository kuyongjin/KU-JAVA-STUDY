
public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2 ; i <= 9 ; i++ ) {
			if(i !=6 && i !=7) {
				
				System.out.println(i + "단");
				for(int x = 1 ; x <= 9 ; x++ ) {
					System.out.println(i + " X " + x + " = " + (i*x));
				}
				
		System.out.println("종료.");		
			}
		}

	}
}