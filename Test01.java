
public class Test01 {

	public static void main(String[] args) {
		//if문 문법....
		
		int value1 = 7;
		
		if(value1 > 10) {
			//이부분이 조건이 성립(true)되면 스코프 안쪽이 실행됨. false 가되면 스코프 안쪽은 실행이 되지 않는다.
			System.out.println("Value는 7보다 큽니다.");
			System.out.println("!!!!!!!!!!!!!!!!!!");
		}
		
		if(value1 == 7) System.out.println("value는 7입니다.");
			//중괄호 생략이 가능한 경우는 딱 한가지 - 안쪽에 있는 소스코드가 단 1줄일때만 영향을 받지 않음.
		System.out.println("종료");
	}
}