
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요";
		int a1 = 10;
		int a2 = 20;
		int a3 = 3;
			
		String result1 = str1 + a1; //양쪽다 숫자이면 산술연산이 발생되나
		//한쪽이라도 문자열인 경우 숫자메모리를 문자로 읽어들여 연산이 됨.
		System.out.println(result1); // 문자열 + 문자열로 연산이 됨.
		
		String result2 = str1 + (a1 + a2); //동일연산자는 앞쪽부터 우선순위임.
		System.out.println(result2);
		
		String result3 = str1 + a1 + a2 * a3;
		System.out.println(result3);
		
	}

}
