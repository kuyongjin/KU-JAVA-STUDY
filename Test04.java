
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문안에 else문 else문안에 if문이 들어갈수 있다!
		int value1 = 7;
		
		if(value1 > 10) {
			System.out.println("10보다 큽니다.");
		}else {
			if(value1 > 5) {
				System.out.println("10보다는 크지 않고 5보다 큽니다.");
			}else {
				if(value1 > 3) {
					System.out.println("10보다 크지않고 5보다 크지않고 3보다는 큽니다.");
				}else {
					System.out.println("이도저도 아닙니다.");
				}
			}
		}
	}
}
