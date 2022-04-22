
public class Test03 {
	
	public static void main(String [] args) {
		//연산자 우선 순위...
		int aaa1 = 1 + 2 * 3 + 4;
		
		System.out.println(aaa1);
		
		int aaa2 = ((1 + 2) * 3) + 4; //가독성을 올려줘야함! 다음번 연산자 순위를 알려줘야함!!
									  //연산자 우선순위를 외울필요는 없지만 신경은 써주자.
		
		System.out.println(aaa2);
	}

}
