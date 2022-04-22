
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !!산술연산자!! + - * / %(나머지)
		
		int aaa1 = 1 + 2; // = (대입연산자는 제일마지막에 실행)
		int aaa2 = aaa1 + 3;
		aaa2 = aaa2 + 4; // 굉장히 많이 나옴
		System.out.println(aaa2);		
		
		int result3 = 3 - 1;
		
		int aaa3 = 4 * 3;
		int aaa4 = aaa3 * 2;
		aaa4 = aaa4 * 7;
		System.out.println(aaa4);
		
		int aaa5 = 1/ 2;
		System.out.println(aaa5);
		
		double aaa6 = 1.0 / 2.0; // 정수 나누기... 피연산자가 둘다 정수인 경우 정수 나누기가 이루어짐.
								// but 한쪽이라도 실수이면 실수 나누기를 실행함 
								// -> 리터럴을 실수로 변경 또는 타입캐스팅을 해주면 됨.
								// 타입캐스팅하는 방법을 주로 사용함.
		double aaa7 = (double)1 / 2;
		System.out.println(aaa6);
		System.out.println(aaa7);
		
		int aaa8 = 3 % 2; // 생각외로 중요함. 나머지 연산.... 논리(알고리즘)의 핵심
		System.out.println(aaa8);
		}

}
