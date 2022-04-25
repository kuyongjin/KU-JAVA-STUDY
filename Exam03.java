
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int left = 2 ; left <= 9 ; left++) {
			System.out.println(left + "단");
			for (int right = 1 ; right <= 9 ; right++) {
				System.out.println(left + "X" + right + "=" + (left*right));
			}
		}
	}
}
