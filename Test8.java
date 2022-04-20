import java.util.Scanner;

public class Test8{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("input start value plz..");
		String inputStart = scn.nextLine();
		System.out.println("input end value plz..");
		String inputEnd = scn.nextLine();
		System.out.println("input multiple value plz..");
		String inputMultiple = scn.nextLine();
		
		int start = Integer.parseInt(inputStart);
		int end = Integer.parseInt(inputEnd);
		int multiple = Integer.parseInt(inputMultiple);

		int index = start;
		int sum = 0;
		
		while(index <= end){
			if(index%multiple ==0){
				sum = sum + index;
			}	
			index = index + 1;
		}
		System.out.println(sum);
		System.out.println("bye~");	
	}
}