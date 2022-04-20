import java.util.Scanner;


public class Test5{
	public static void main(String [] args){
		//.....
		Scanner scn = new Scanner(System.in);
		System.out.println("how much???");
		String inputValue = scn.nextLine();
		int test = Integer.parseInt(inputValue);
			
		int count = 0;
		while(count < test){
			System.out.println("hello-");
			System.out.println("welcome-");
			count = count + 1;
		}
		
		System.out.println("bye~");
	}
}