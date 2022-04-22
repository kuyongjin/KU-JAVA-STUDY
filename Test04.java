
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부호연산자...
		
		
		int aaa1 = 1;
		System.out.println(aaa1);
		
		aaa1 = -aaa1; 
		System.out.println(aaa1);
		
		aaa1 = -aaa1;
		System.out.println(aaa1);
		
		//이런 문법은 왜 존재하는거지?? - 쓸일은 없으나 마이너스에 대한 정의를 내려주는 문법임.
		int aaa2 = -2;
		aaa2 = +aaa2;
		System.out.println(aaa2);
				
		
	}

}
