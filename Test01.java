
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = new int[5];
		list[0] = 10;
		list[1] = 30;
		list[2] = 20;
		list[3] = 0;
		list[4] = 70;
	
//		//리스트의 반복 - 고전적 for문 활용 - 특수한 경우에만 사용.
//		for(int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
			
		//리스트의 반복 - 향상된 for문 (foreach문) 활용 // 제어할수는 없으나 일반적으로 사용됨.
		for(int xxxxxxx:list) { //좌측에는 변수 : 어래이 OR 리스트를 넣어주면 됨.
			System.out.println(xxxxxxx);
			
		
		}
	}

}
