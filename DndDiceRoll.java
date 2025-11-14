package CS121;

import java.util.Scanner;

public class DndDiceRoll {

	public static void main(String[] args) {
		
		//Declaring variables and scanner
		Scanner scanner = new Scanner(System.in);
		double tempRand = 0;
		int result = 0;
		int flag = 0;
		String input = "";
		
		
		//Credits
		System.out.println("Dnd Dice Rolling Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This program will simulate rolling each different kind of dice you use in Dnd.");
		System.out.println();
		System.out.print("Press enter to roll the dice! ");
		scanner.nextLine();
		
		//While loop start
		while(flag == 0)
		{
			
			//screen clear
			for(int i = 0; i < 50; i++)
			{
				System.out.println();
			}
			
			//Calculations and output
			
			//D4 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 4) + 1;	
			System.out.println("<-------------->");
			System.out.printf("|" + "%15s", "4-Sided: " + result + " |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D6 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 6) + 1;
			System.out.printf("|" + "%15s", "6-Sided: " + result + " |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D8 roll
			tempRand = Math.random();
			result = (int) (tempRand * 8) + 1;
			System.out.printf("|" + "%15s", "8-Sided: " + result + " |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D10 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 10);
			System.out.printf("|" + "%15s", "10-Sided: " + result + " |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D12 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 12) + 1;
			System.out.printf("|" + "%15s", "12-Sided: " + result +" |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D20 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 20) + 1;
			System.out.printf("|" + "%15s", "20-Sided: " + result + " |");
			System.out.println();
			System.out.println("|--------------|");
			
			//D100 Roll
			tempRand = Math.random();
			result = (int) (tempRand * 100);
			System.out.printf("|" + "%15s", "100-Sided: " + result + " |");
			System.out.println();
			System.out.println("<-------------->");
			
			System.out.println();
			System.out.println("To roll again, press enter.");
			System.out.printf("Enter any keypress to exit program. ");
			
			input = scanner.nextLine();
			
			if(input != "")
			{
				flag = 1;
				
				//screen clear
				for(int i = 0; i < 50; i++)
				{
					System.out.println();
				}
				
				System.out.println("Good luck in your game!");
				System.out.println("Program end.");
			}
			
		}//While loop end
		
		//close scanner
		scanner.close();
		
	}//end of main

}//end of file
