
public class PP {

	public static void main(String[] args) {
		Test ts = new Test();
		
		
		
		
		
		System.out.println(ts.math);//0
		int a= ts.digital2(1);//2
		
		System.out.println(a);
		System.out.println(ts.math);//10
		
		
	}
}

class Test{
	int math;
	int eng;
	
	
	void digital() {
		
		
	}
	
	int digital2(int a) {
		math+=10;
		System.out.println("나 계산한다");
		return a*2;
	}
}
