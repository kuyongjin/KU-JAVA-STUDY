import java.util.Scanner;
public class Test99 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.구구단 출력 단별로");
			System.out.println("2.구구단 전체 출력");
			System.out.println("0. 나가기");
			
			System.out.println("원하시는 번호를 눌러주세요.");
			String menuInputValue = scn.nextLine();
			
//			int number1 = Integer.parseInt(inputValue);
			if(menuInputValue.equals("1")) {
				System.out.println("몇단을 출력하시겠습니까?");
				String guguInputValue  = scn.nextLine();
				int left = Integer.parseInt(guguInputValue);
				int right = 1;
				System.out.println(left + "단");
				while(right <= 9) {
					System.out.println(left + "X" + right + "=" + (left*right) );
															
					right = right + 1;
					}
				
			}if(menuInputValue.equals("2")) {
				int left1 = 2;
				int right1 = 1;
				while(left1 <= 9) {
					System.out.println(left1 + "단");
					while(right1 <=9) {
						System.out.println(left1 + "X" + right1 + "=" + (left1*right1) );
						
						right1 = right1 + 1;	
					}
					left1 = left1 + 1;
					right1 = 1;
				
					
					
				}
				
				
			}if(menuInputValue.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
		
		}
		
	}
}
