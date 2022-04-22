
public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자.. ! &&논리곱 ||논리합 
		
		boolean test = true;
		System.out.println(test);
		test = !test;
		System.out.println(test);
		
		// 논리 곱 && : 피연산자 둘다 true 일떄만 ture 나머지는 false - 양쪽 모두 true or false 여야만 함.(boolean)
		// 무엇무엇 이고 무엇무엇 인 경우
		test = false && true;
		System.out.println(test);
		// 논리 합 || : 피연산자 둘다 false 일떄만 flase 나머지는 true - 상동
		// 무엇무엇 이거나 혹은 무엇무엇 인 경우
		test = false || true;
		System.out.println(test);
	
		
	}

}
