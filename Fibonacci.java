package CS121;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double x = 0;
		double y = 0;
		double z = 0;
		double gr = 0.0;
		int amount = 0;
		int flag = 0;
		String str = ""; //String for our enter continue press
		
		
		//Main while loop so we can keep the program repeating
		while(flag == 0)
		{
			
			
			//screen wipe
			for(int i = 0; i < 50; i++)
			{
				System.out.println();
			}
			//Credits
			System.out.println("Fibonacci Program");
			System.out.println("By: Jonah Layman");
			System.out.println();
			
			//Story Line
			System.out.println("You will be asked to enter two numbers \"x\" and \"y\", along with how many numbers to calculate.");
			System.out.println("The program will then display a fibinacci sequence based on your supplied numbers.");
			System.out.println("You will also see the golden ratio displayed based on your sequence.");
			System.out.println("Enter a negative number for \"x\" to exit the program when you are finished.");
			System.out.println();
			
			//user Inputs start
			System.out.print("Please enter x: ");
			x = scanner.nextDouble();
			System.out.println();
			// program will not continue past this point if user enters a negative number for x
			if(x >= 0)
			{
				
				//x is not negative so we continue
				System.out.print("Please enter y: ");
				y = scanner.nextDouble();
				System.out.println();
				
				System.out.print("How many numbers out to print in the sequence?: ");
				amount = scanner.nextInt();
				scanner.nextLine();
				System.out.println();
				//got all our user inputs.
				
				//screen wipe
				for(int i = 0; i < 50; i++)
				{
					System.out.println();
				}
								
				
				
				//Output and Calculations	
				//ensure that the smaller number is x before we start
				if(y < x) 
				{
					z = x;
					x = y;
					y = z;
				}
	
				
				System.out.printf("%10s", "seed 1");
				System.out.printf("%10s", "seed 2");
				
				for(int i = 1; i <= amount; i++)
				{
					System.out.printf("%10s", "num " + i);
				}
				System.out.println();
				System.out.printf("%10.0f", x);
				System.out.printf("%10.0f", y);
				
				for(int i = 1; i <= amount; i++)
				{
					z = x + y;
					System.out.printf("%10.0f", z);
					x = y;
					y = z;
				}
				gr = y/x;
				System.out.println();
				System.out.println();
				System.out.println("Golden Ratio: " + gr);
				
				
				System.out.println();
				System.out.println("Press Enter to continue");
				str = scanner.nextLine();
				
				//screen wipe
				for(int i = 0; i < 50; i++)
				{
					System.out.println();
				}				

			}
			
			//if x was negative then we drop down to here. 
			//We got our negative number, so the program will exit
			if(x < 0)
			{
				flag = 1;
				System.out.println("Exiting Program");
			}
			
		}//end of while loop
		
	
	//Closing scanner
	scanner.close();
		
	}//end of main

}//end of file
