
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		int attend = 80;
		int unicef = 80;
      //int buljum = 0;
		
		if(attend >= 80 && (score >= 90 || unicef == 100)) {
			System.out.println("장학금 지급 대상입니다.");
		}else {
			System.out.println("장학금 지급 대상이 아닙니다.");
		}
	}

}
