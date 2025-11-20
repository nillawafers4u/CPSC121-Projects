package CS121;

import java.util.Scanner;

public class TickTackToeGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String enter = "";
		boolean flag = true;
		int input = 0;
		int[][] t = new int[4][4];
		
		
				
		do 
		{
		
			cls();
			title("Game Menu");
			display(t);
			
			
			System.out.println("1 - Play Tic Tac Toe");
			System.out.println("2 - Quit");
			System.out.println();
			System.out.printf("%24s","Enter your Choice ");
			
			enter = scanner.nextLine();
			try 
			{
				input = Integer.parseInt(enter);
			}
			catch(Exception err)
			{
				input = 9;
			}
		
			switch(input)
			{
				case 1:
					cls();
					System.out.printf("%21s","This is option 1");
					System.out.println();
					System.out.printf("%25s","### WORK IN PROGRESS ###");
					System.out.println();
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
				
				case 2:
					cls();
					System.out.println("Thanks for playing, Goodbye!");
					flag = false;
					break;
					
				default:
					cls();
					System.out.println("Unrecognized option, please pick 1 or 2");
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
			}
			
		}while (flag);
	
		scanner.close();
		
	}//end of main
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
	public static void display(int [][] t)
	{
		
		System.out.printf("%23s","The Current Board");
		System.out.println();
		for(int i = 1; i<=9; i++)
		{

			int row = (i-1)/3 + 1;
			int col = ((i-1) % 3 + 1);
			

			if(t[row][col] == 0)
			{
				if(col == 1)
				{
					System.out.print("         ");
				}
				
				System.out.printf("%2d", i);
			}
			if(i % 3 == 0) 
			{
				System.out.println();
				if(row < 3)
				{
					System.out.printf("%20s","---+---+---");
				}
				
				System.out.println();
			}
			if(i % 3 != 0) 
			{
				System.out.print(" |");
			}
			
			if(t[row][col] == -1)
			{
				System.out.printf("%5d", "X");
			}
			if(t[row][col] == 1)
			{
				System.out.printf("%5d", "O");
			}
			
			
			
		}//end of i for loop
	}// end of display method
	

	public static void title(String sub)
	{
		System.out.printf("%24s","Tick Tack  Toe Game");
		System.out.println();
		System.out.printf("%22s","By Jonah Layman");
		System.out.println();
		System.out.printf("%19s",sub);
		System.out.println();
		System.out.println();	
	}//end of title
	
}//end of class
