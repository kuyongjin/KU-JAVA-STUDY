
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 - while / 조건문 (true or false)만 들어갈 수 있음.
		// while문도 중괄호 생략가능 (1개의 코드만 출력시)
		// while문은 false가 되지않는이상 반복되고
		// false값을 1번이상은 만들어 줘야함.
		int value = 1;

		while (value < 10) {
			System.out.println("안녕하세요" + value);
			value += 2;
		}
		
	}
}


//terminated = 무한반복시 안뜸, 활성화 안됨.	