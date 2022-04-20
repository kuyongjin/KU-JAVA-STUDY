import java.util.Scanner;

public class PhoneBook{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		String [] names = new String[10];
		String [] numbers = new String[10];
		int count = 0;
		
		System.out.println("*****welcome to phone book*****");

		while(true){
			System.out.println("##Menu");
			System.out.println("1.input:");
			System.out.println("2.show list");
			System.out.println("3.search");
			System.out.println("0.exit");
			System.out.print("select menu >");
			
			String inputValue = scn.nextLine();
			if(inputValue.equals("0")){
				System.out.println("thx and bye~!");
				break;
			}else if(inputValue.equals("1")){
				System.out.print("input name plz >");
				String name = scn.nextLine();
				System.out.print("input phone number plz > ");
				String number = scn.nextLine();
				
				names[count] = name;
				numbers[count] = number;
				count ++;
								
				System.out.println("input complete...");
				System.out.println("press enter to continue...");
				scn.nextLine();
			}else if(inputValue.equals("2")){
				System.out.println("===== list =====");
				for(int i = 0 ; i < count ; i++){
					System.out.println("name:" + names[i] + "/number:" + numbers[i]);
				}
				
				System.out.println("press enter to continue...");
				scn.nextLine();
			}
		}


	}

}