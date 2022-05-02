import java.sql.Time;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1개 클래스 기준
		// 1. 학생 등록 기능... 이름,나이,점수
		// 2. 전체 학생 리스트 출력...
		// 3. 학생이름으로 검색 기능
		// 4. 클래스의 평균 나이, 평균 점수
		// 5. 특정학생의 삭제기능 - 학생이름으로 삭제
		// 6. 학생 정보 수정 
		Scanner scn = new Scanner(System.in);
		System.out.println("***** Student Info Manager Ver-0.1 *****");
		
		String [] nameList = new String[5];
		int [] ageList = new int [5]; //의도가 다른경우 무조건 따로 봐야함.
		int [] scoreList = new int[5];
		int count = 0; //인덱스로 활용
				
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.등록");
			System.out.println("2.목록 출력");
			System.out.println("3.검색");
			System.out.println("4.통계");
			System.out.println("5.삭제");
			System.out.println("6.수정");
			System.out.print("입력 (q=종료) > ");
			String input = scn.nextLine();
			
			if(input.equals("q")) {
				break;
			}
			if(input.equals("1")) {
				//입력
				System.out.print("이름 입력 > ");
				String name = scn.nextLine();
				
				System.out.print("나이 입력 > ");
				int age = Integer.parseInt(scn.nextLine());
				
				System.out.print("점수 입력 > ");
				int score = Integer.parseInt(scn.nextLine());
				
				
				//여기 난이도 높아짐... 배열의 확장 및 복제
				if(count >= nameList.length) {
					String [] tempNameList = new String[nameList.length*2];
					for(int i = 0; i<nameList.length; i++) {
						tempNameList[i] = nameList[i];
					}
					nameList = tempNameList;//
				}
				if(count >= ageList.length) {
					int [] tempAgeList = new int[ageList.length*2];
					for(int i = 0; i<ageList.length; i++) {
						tempAgeList[i] = ageList[i];
					}
					ageList = tempAgeList;
				}
				if(count >= scoreList.length) {
					int [] tempScoreList = new int[scoreList.length*2];
					for(int i = 0; i<scoreList.length; i++) {
						tempScoreList[i] = scoreList[i];
					}
					scoreList = tempScoreList;
				}
				
				
				nameList[count] = name;
				ageList[count] = age;
				scoreList[count] = score;
				
				count++;
						
			}else if(input.equals("2")) {
				//리스트 출력
				System.out.println("=====학생 목록=====");
				for(int i = 0; i < count; i++) {
					System.out.println(nameList[i]);
				}
				System.out.println("계속하시려면 enter를 입력해 주세요.");
				scn.nextLine();
				
			}else if(input.equals("3")) {
				//검색
				System.out.print("검색 대상을 입력 > ");
				String searchName = scn.nextLine();
				int searchCount = 0;
				
				for(int i = 0; i<count; i++) { // 완전탐색
					if(searchName.equals(nameList[i])) {
						System.out.println("이름:"+nameList[i]+",나이:"+ageList[i]+",점수:"+scoreList[i]);
						searchCount++;	
					}
					
					if(searchCount <=0) {
						System.out.println("검색 결과가 없습니다. 다시 확인 부탁드립니다.");
					}
					System.out.println("다시 시작하시려면 엔터를 입력해 주세요.");
					scn.nextLine();
				}
				
				
			}else if(input.equals("4")) {
				//통계 ( 평균나이, 평균점수)
					int ageSum = 0;
					int scoreSum = 0;
					
					
					for(int i = 0; i<count; i++) {
						ageSum += ageList[i];
						scoreSum += scoreList[i];
					}
					if(count == 0) {
						System.out.println("학생이 존재하지 않습니다.");
					}else {
						double ageAvg = ageSum/(double)count;
						double scoreAvg = scoreSum/(double)count;
						System.out.println("학생의 수 :"+count);
						System.out.println("전체 학생 평균나이: " + ageAvg);
						System.out.println("전체 학생 평균점수: " + scoreAvg);
					}
					System.out.println("다시 시작하시려면 엔터를 입력해 주세요.");
					scn.nextLine();
					
				
			}else if(input.equals("5")) {
					
				//삭제---배열같은경우는 밀어넣기를 해야함.
				System.out.println("삭제할 이름 > ");
				String deleteName = scn.nextLine();
			
				int deleteCount = 0;
				for(int i = 0; i<count; i++) {
					if(deleteName.equals(nameList[i])) {
						for(int x = i; x< count - 1; x++) {
							nameList[x] = nameList[x+1];
							ageList[x] = ageList[x+1];
							scoreList[x] = scoreList[x+1];
						}
						count--;
						deleteCount++;
						i--;
					}
				}
				System.out.println(deleteCount + "명이 삭제되엇습니다.");
				System.out.println("다시 시작하시려면 엔터를 입력해 주세요.");
				scn.nextLine();
				
			}else if(input.equals("6")) {
				// 수정
				System.out.println("점수 수정할 학생의 이름 > ");
				String modifyName = scn.nextLine();
				for(int i = 0; i < count; i++) {
					if(modifyName.equals(nameList[i])) {
						System.out.print("수정 할 점수 > ");
						int score = Integer.parseInt(scn.nextLine());
						scoreList[i] = score;
					}
				}
			}else {
				System.out.println("값을 잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("계속하시려면 enter를 입력해 주세요.");
				scn.nextLine();
			}
			
		}
		System.out.println("프로그램을 종료합니다, 이용해주셔서 감사합니다.");
	}

}
