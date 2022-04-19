import java.util.Scanner;

public class PlusCalc{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("****** welcome Plus calculator ******");
		System.out.println("input first value ... plz");

		String value1 = scn.nextLine();
		System.out.println("input second value ...plz");
		String value2 = scn.nextLine();

		int v1 = Integer.parseInt(value1);
		int v2 = Integer.parseInt(value2);

		int result = v1 / v2;

		System.out.println("result : " + result);
		System.out.println("bye~");
	}
}

