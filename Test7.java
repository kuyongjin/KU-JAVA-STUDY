
public class Test7 {

	public static void main(String[] args) {
		//명명법-------------------------------------
		int aaa = 10;
		//변수명은 원하는데로 설정이 가능하나
		//몇가지경우에는 안됨.
		///1. 숫자는 맨앞에 들어가면 안된다.
		//int 1aa = 20;
		///2. 문자와 숫자 그리고 특수문자 _ $ 로 만들수 있다.
		int aa1 = 10; 
		int a_a1$ = 10;
		int $444 = 10; // 사실상 특수문자는 거의 쓰이지 않음.
		///3. 보라색(타입명)을 변수로 쓸수 없다.
		//int int = 10;
		
		//중요!!!!!! = 필수는 아니지만 전세계 사람들이 따르는 명명법
		//변수명은 항상 소문자로 시작하고... 2개의 워드가 조합될때는 다음 워드의 첫글자는 대문자.
		int AAA = 10; // X 
		int Score = 1; // X
		int scoRe = 20; // X
		int score = 20; // O
		int studentscore = 20; //X
		int studentScore = 20; //O
		int studentScoreValue = 20; //O
		int studentScorevalue = 20; //X
		
		///.......
		
		//스네이크 케이스 ( C , C++)
		int student_score_value = 20; //X->과거의 잔해물!
		
		//카멜 케이스
		int studentScoreValue1 = 30; //O

					   
	}

}
