package CS121;

import java.util.Scanner;

public class MiddleCharacterProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int len = 0;
		int mid = 0;
		int inc = 0;
		int sp = 0;
		boolean flag = true;
		
		do 
		{
			cls();
			title("Main Program");
			System.out.println("Enter '/' to exit");
			System.out.print("Please enter a string: ");
			name = scanner.nextLine();
			
			if(name.equals("/"))
			{
				flag = false;
				break;
			}
			len = name.length();

			//even
			if(len%2==0)
			{
				mid = len/2 - 1;
				inc = 2;
				sp = (mid + 1) * 3 + 2;
			}
			//odd
			else
			{
				mid = len/2;
				inc = 1;
				sp = (mid + 1) * 3;
			}
			
			cls();
			title("Output Screen");
			System.out.println("You entered: " + name);
			System.out.println("The middle is: " + name.substring(mid, mid+inc));
			
			for(int i = 0; i< name.length(); i++)
			{
				System.out.printf("%3s", name.charAt(i));
			
			}
			
			System.out.println();
			System.out.printf("%"+(int) sp+"s", name.substring(mid, mid+inc));
			System.out.println();
			System.out.println();
			System.out.println("Press enter to continue");
			scanner.nextLine();
			
		}while(flag);
		
		
		cls();
		title("Quit Screen");
		System.out.println("Goodbye!");
		
		scanner.close();
	}//end of main
	
	public static void title(String sub)
	{
		System.out.println("Middle Character Program");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls

}
