import java.util.Scanner;

public class Test7{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("input number plz...");
		String inputValue = scn.nextLine();
		int number1 = Integer.parseInt(inputValue);
	
		int index = 1;
		int sum = 0;

		//1 to inputValue sum total - 3x
		while(index <= number1){
			if(index%3==0){
				sum = sum + index;
			}
			
			index = index + 1;	
		}
		
		System.out.println(sum);
		System.out.println("bye~");
	}

}