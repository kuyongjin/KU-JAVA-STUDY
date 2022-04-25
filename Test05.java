
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch case - ()안쪽이 조건식이 아님.
		// if문으로 완변하게 대체할수 있음.
		//처음 공부하시는 분들을 위한 팁 : if 문을 확실하게 공부하면...
		

		int value1 = 4; // 변수의 값 위치부터 프린트를 해줌.

		switch (value1) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("그외의 경우입니다.");

		}
	}
}
