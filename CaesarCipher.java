package CS121;

import java.util.Scanner;

public class CaesarCipher
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput = "";
		int key = 0;
		String result = "";


		title("Main Function");
		System.out.print("Please enter the number of letters to shift for your key: ");
		do
		{
			try
			{
				key = Integer.parseInt(scanner.nextLine());
				if (key <1 || key > 25)
				{
					key = 0;
					throw new Exception();
				}
			}
			catch (Exception ex)
			{
				cls();
				title("Main Function");
				System.out.println("Invalid input, please enter a number (1-25)");
				System.out.print("Please enter the number of letters to shift for your key: ");
			}
		}while(key == 0);

		System.out.print("Please enter your single word to be encoded: ");
		userInput = scanner.nextLine();
		System.out.println();
		System.out.println("Result: " + encode(userInput, key));

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
		System.out.println("Caesar Cipher");
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
		char shifted;

		for(int i = 0; i<input.length(); i ++)
		{
			current = input.charAt(i);
			currentNum = (int) current;
			if (currentNum >= 97)
			{
				shiftedNum = (currentNum-97+key) % 26 + 97;
			}
			else
			{
				shiftedNum = (currentNum-65+key) % 26 + 65;
			}

			shifted = (char) shiftedNum;
			output += shifted;
		}
		return output;
	}//end of encode

}
