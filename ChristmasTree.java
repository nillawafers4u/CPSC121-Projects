package CS121;

import java.util.Scanner;

public class ChristmasTree {

	public static void main(String[] args) {
		//Declaring scanner and variables
		int size = 0;
		Scanner scanner = new Scanner(System.in);

		
		//Credits
		System.out.println("Christmas Spirit Generator");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This program will ask how big you want to make your tree (in number of rows).");
		System.out.println("You will then see your very own christmas tree displayed.");
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter how many rows you want your tree to be: ");
		size = scanner.nextInt();
		System.out.println();
		
		//Calculations and prints
		for(int i = 1; i <= size; i++)
		{
			//so the tree isn't right up against the side of the screen
			System.out.print(" ");
			for(int j = 1; j <= size - i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (i*2)-1; k++)
			{
				
				System.out.printf("%s", "*");
				
			}
			System.out.println();
			
			
			//make a stem for the tree
			if(i == size)
			{
				if(size < 12)
				{
					System.out.printf("%" + (size+1) + "s", "|");
				}
				else
				{
					System.out.printf("%" + (size+2) + "s", "|||");
					System.out.println();
					System.out.printf("%" + (size+2) + "s", "|||");
		
				}
			}
			
			
		}//end of i loop
	
	
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
