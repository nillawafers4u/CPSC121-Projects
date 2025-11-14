package CS121;

import java.util.Scanner;

public class NestingForLoops {

	public static void main(String[] args) {
		//to center : number of characters + number of spaces we need
		//see next line for example to center the text within the 40 character table.
		System.out.printf("%30s", "Multiplication table");
		System.out.println();
		System.out.print("----");
		
		for(int i = 1; i <= 9; i++)
		{		
			System.out.printf("%4d", i);
		}//end first loop
		
		System.out.println();
		
			for(int i = 1; i <= 9; i++)
			{
				
				System.out.printf("%4s", i +"| ");
				
				for(int j = 1; j <= 9; j++)
				{
					System.out.printf("%4d", i*j);
				}//end of j loop
				System.out.println();
				
				
				
				
			}//end of i loop
			System.out.println();
		
			
			
			
			
			for (int i = 1; i <=10; i++)
			{
				for (int j = 1; j <=i; j++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		

	}

}
