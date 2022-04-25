
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 1;
		
		while(value<100) {
			value++;
			
			if(value%3 != 0) {
				continue;//탈출하지는 않는데.. 밑에있는 코드를 실행하지 않고 위로 올라감.
				
			}
			System.out.println("value : "+ value);
		}
	}

}
