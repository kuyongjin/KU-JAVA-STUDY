import java.util.Scanner;

public class Test6{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("input score.. plz..");
		String inputValue = scn.nextLine();
		int score = Integer.parseInt(inputValue);
		
		if(score >= 90){
			System.out.println(" A ");
		}else if(score>=80){
			System.out.println(" B ");
		}else{
			System.out.println(" F ");
		}
		System.out.println("bye~");		
	}	
}