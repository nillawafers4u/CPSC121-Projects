package CS121;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		String reverse = "";
		boolean flag = true;
		
		do
		{
			input = "";
			reverse = "";
			cls();
			title("Main Menu");
			System.out.println("This program will ask you for a word or phrase.");
			System.out.println("It will then display what you entered in reverse.");
			System.out.println("It will also let you know if it is a palindrome.");
			System.out.println("Enter '/' at the prompt to quit the program.");
			System.out.println();
			System.out.print("Enter your word or phrase: ");
			input = scanner.nextLine().toUpperCase();
			if(input.equals("/"))
			{
				flag = false;
			}
			else
			{
				for(int i = (input.length() - 1); i >=0; i--)
				{
					reverse = reverse + input.charAt(i);
				}
				cls();
				title("Results");
				System.out.println("Original user input in caps: " + input);
				System.out.println();
				System.out.println("Input reversed: " + reverse);
				System.out.println();
				if(reverse.equals(input))
				{
					System.out.println(reverse + " is a palindrome!");
				}
				else 
				{
					System.out.println(input + " is not a palindrome");
				}
				
				System.out.println("Press enter to continue. Or '/' to quit");
				input = scanner.nextLine();
				if(input.equals("/"))
				{
					flag = false;
				}
			}
		
		
		}while(flag);
		
		cls();
		title("Quit Screen");
		System.out.println("Thanks for using my program!");
		scanner.close();
	}

	public static void title(String sub)
	{
		System.out.println("Palindrome Program");
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
