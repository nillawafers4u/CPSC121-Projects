package CS121;

import java.util.Scanner;

public class Encoding_Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		int key = 0;
		boolean flag = true;
		int choice = 0;


		do
		{
			cls();
			title("Main Menu");
			
			System.out.println("This program will encode your message using a shift key.");
			System.out.println("1. Choose an amount to shift");
			System.out.println("2. Encode a message");
			System.out.println("3. Decode a message");
			System.out.println("4. Quit");
			System.out.println();
			System.out.print("Please choose an option: ");
			
			//parsing user's input into an integer
			userInput = scanner.nextLine();
			try 
			{
				choice = Integer.parseInt(userInput);
			}
			catch(Exception err)
			{
				choice = -2;
			}
			
			switch(choice)
			{
			
			//key select
			case 1:
				do
				{
					cls();
					title("Key Selection");
					System.out.print("Please enter the number of letters to shift for your key: ");
					try
					{
						key = Integer.parseInt(scanner.nextLine());
						if (key < 1 || key > 128)
						{
							key = 0;
							throw new Exception();
						}
						System.out.println("Key saved! Press enter to return to menu.");
						scanner.nextLine();
						break;
					}
					catch (Exception ex)
					{
						cls();
						title("Key Selection");
						System.out.println("Invalid input, please enter a number (1-128)");
						System.out.print("Please enter the number of letters to shift for your key: ");
					}
				}while(key == 0);
				break;
			//encode message
			case 2:
				cls();
				title("Encode Message");
				System.out.print("Please enter your message to be encoded: ");
				userInput = scanner.nextLine();
				System.out.println();
				System.out.println("Result: " + encode(userInput, key));
				System.out.println("Press enter to continue");
				scanner.nextLine();
				break;
			//decode message
			case 3:
				cls();
				title("Decode Message");
				System.out.print("Please enter your message to be decoded: ");
				userInput = scanner.nextLine();
				System.out.println();
				System.out.println("Result: " + decode(userInput, key));
				System.out.println("Press enter to continue");
				scanner.nextLine();
				break;
			//quit
			case 4:
				cls();
				title("Quit");
				System.out.println("Goodbye!");
				flag = false;
				break;
				
			default:
				cls();
				title("Invalid Selection");
				System.out.println("Looks like you havne't entered a valid option.");
				System.out.println("Please try again!");
				System.out.println("Press enter to continue...");
				scanner.nextLine();
				break;
			}
		}while(flag);
		
		scanner.close();
	}

	public static void cls()
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls

	public static void title(String sub)
	{
		System.out.println("Encoding Program");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();
	}//end of title

	public static String encode(String input, int key)
	{
		String output = "";
		char current;
		int currentNum = 0;
		int shiftedNum = 0;
		String shifted = "";

		for(int i = 0; i<input.length(); i ++)
		{
			current = input.charAt(i);
			currentNum = (int) current;
			shiftedNum = currentNum+key;
			shifted = Integer.toHexString(shiftedNum);
			if (shifted.length() == 1) {
			    shifted = "0" + shifted; //  Add a leading zero to keep it 2 digits
			}
			output += shifted;
		}
		return output;
	}//end of encode
	
	public static String decode(String input, int key)
	{
		if(input.length() % 2 != 0)
		{
			return "error, non even string. You may have mistyped!";
		}
		String output = "";
		int currentNum = 0;
		int shiftedNum = 0;
		char shifted;

		for(int i = 0; i<input.length(); i += 2)
		{
			currentNum = Integer.parseInt(input.substring(i,i+2), 16);
			shiftedNum = currentNum-key;
			shifted = (char) shiftedNum;
			output += shifted;
		}
		return output;
	}//end of decode

}
