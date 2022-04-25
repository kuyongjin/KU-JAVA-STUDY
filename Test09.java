
public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문 for문 - 고전적 for문
		// 몇부터 ; 몇까지 ; 몇씩 증가시켜라.
		// for ( 1.변수생성(최초1회만 실행) ; 2.조건식확인 ; 3.증감식 ){}
		// 변수의 소멸시기? for문 시작시 최초 생성 for문이 빠져 나갈때 소멸됨.
		// for문 밖에서는 변수명을 동일하게 가져갈수 있음. 해당 for문안에서 빠져나가는경우는 사용이 안됨.
		
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(i);
		}
	
		for(int i = 1 ; i <20 ; i++) {
			System.out.println(i);
		}
	
	
	
	}
	

}
