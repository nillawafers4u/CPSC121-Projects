package CS121;

import java.util.Scanner;

public class Method121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x = 0;
		int y = 0;
		int i = 0;
		int c = 0;
		int total = 0;
		int flag = 0;
		
		cls();
		
		do
		{
			System.out.println("This program will keep a running total of the numbers you entered.");
			System.out.println("So far you have entered " + c + " numbers, with a total of " + total);
			System.out.print("Enter a number, -1 to end ");
			x = input.nextInt();
			System.out.println();
			
			cls();
			
			if (x != -1)
			{
				c = c+1;
				total = total + x;
			}
			else
			{
				flag = 1;
			}
		} while (flag != 1);
		//end of do while loop
		System.out.println("You have entered " + c + " numbers, with a total of " + total);
		
		
	}//end of main

	public static void cls()
	{
		for(int i = 1; i <=50; i++)
		{
			System.out.println();
		}
	}//end of cls method
	
}//end of class
