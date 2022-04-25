
public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		int i = 1;
		int sum = 0;
		
			while(true) {
				if(i%2==1) {
					sum = sum+i;
								
				}else {
					sum = sum-i;
				}	
			
				if(sum>=100){
					System.out.println(i);
					break;
				}
				i++;
			}

		}

}
