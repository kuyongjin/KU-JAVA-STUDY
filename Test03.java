
public class Test03 {

	public static void main(String [] args) {
		
		int value = 2;
		
		//if else if .... else 
		//조건식의 순서가 매우중요함. 플로우 차트
		
		//(제일 중요) if를 false로 만드는 else if 를 쓸수는 없음.
		if(value > 10) {
			System.out.println("값은 10보다 큽니다.");
			
		}else if(value > 5) {
			//선행하는 if 문이 false여야지만 실행됨. 윗 if 가 false 이고 if 
			System.out.println("값은 10보다 크지않고 5보다는 큽니다.");
			
		}else if(value > 3) {
			System.out.println("값은 10보다 크지않고 5보다도 크지않고 3보다는 큽니다.");
		
		}else { 
			System.out.println("이도저도아닌경우입니다.(값이 10보다 크지않고 5보다도 크지않고 3보다도 크지않습니다.)");
		}
	}
	
}
