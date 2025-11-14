package CS121;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		int num = 0;
		double n = 0.0;
		int heads = 0;
		int tails = 0;
		int edge = 0;
		int flag = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);

		while(flag == 0)
		{
			
			//screen clear
			cls();
			
			//Credits
			title("Main Option");
			
			//Story Line
			System.out.println("The program will ask for the number of times to toss a coin and then toss it for you.");
			System.out.println("Enter a negative number to exit.");
			System.out.println("The program will then display the results from the flips.");
			System.out.println();
	
			
			//user Inputs
			System.out.print("Please enter the number of times to flip? (negative to exit): ");
			num = scanner.nextInt();
			scanner.nextLine();
			

			
			
			//screen clear
			cls();
			
			
			//Calculations
			
			//determines if negative number was given
			if(num < 0)
			{
				flag = 1;
				i = num + 1;
			}
			
			if(num == 0)
			{
				flag = 2;
			}
			
			
			for(i = 1; i<=num; i++)
			{
				n = Math.random();
				
				if(n < .5)
				{
					heads++;
				}
				
				if(n > .5) 
				{
					tails++;
				}
				
				if (n == .5)
				{
					edge++;
				}
			}
			
				
			if(flag == 0)
			{
				//Output
				title("Report Option");
				
				System.out.printf("%20s", "Heads");
				System.out.printf("%20s", "Tails");
				System.out.printf("%20s", "Edge");
				System.out.println();
				System.out.printf("%20d", heads);
				System.out.printf("%20d", tails);
				System.out.printf("%20d", edge);
				System.out.println();
	
				System.out.printf("%19.1f", heads*100.0/(heads+tails+edge));
				System.out.print("%");
				System.out.printf("%19.1f", tails*100.0/(heads+tails+edge));
				System.out.print("%");
				System.out.printf("%19.1f", edge*100.0/(heads+tails+edge));
				System.out.print("%");
				heads = 0;
				tails = 0;
				edge = 0;
				System.out.println();
				System.out.println();
				System.out.println("Press enter to continue");
				scanner.nextLine();
			}
		

			if(flag == 1)
			{
			
				title("End of Program");
				System.out.println("Thanks for using my program!");
				System.out.println();
				System.out.println("That's All Folks!");
			}
			
			if(flag == 2)
			{
				System.out.println("Maybe it was an accident, but inputing 0 won't do anything...");
				System.out.println("Who would've thought?");
				
				System.out.println();
				System.out.println("Press enter to continue");
				scanner.nextLine();
				flag = 0;
			}
			
		}
		//Closing scanner
		scanner.close();

	}//end of main
	
	public static void cls()
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
	public static void title(String subtitle)
	{
		System.out.println("Coin Flip Program");
		System.out.println(subtitle);
		System.out.println("By: Jonah Layman");
		System.out.println();
	}//end of title

}//end of file
