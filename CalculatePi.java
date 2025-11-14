package CS121;

import java.util.Scanner;

public class CalculatePi {

	public static void main(String[] args) {
		double x = 0.0;
		double y = 0.0;
		int hits = 0;
		int amount = 0;
		double pi = 0.0;
		double calc = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);

		
		
		do 
		{
			
		//reset hits
		hits = 0;
		amount = 0;
			
		//title and credits
		cls();
		title("Main option");
		
		

			
		
		//story line
		System.out.println("This progam will use stats to calculate pi.");
		System.out.println("Enter a negative value to quit the program.");
		System.out.println();
		//user input
		System.out.print("Please enter the number of tries for this aproximation of pi: ");

		try
		{
			amount = scanner.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println("Please enter a number greater than 0, or less than 0 to quit.");
		}
		
		scanner.nextLine();
		
		//handle 0 input
		if(amount == 0)
		{
			cls();
			title("Invalid input");
			System.out.println("Sorry, a valid input was not detected, please enter a number greater than 0.");
			System.out.println("Enter a number less than 0 to exit.");
			System.out.println();
			System.out.println("Press enter to continue");
			
			scanner.nextLine();
		}
		
		//negative number to exit program
		if(amount < 0)
		{
			cls();
			System.out.println("Negative number entered, exiting program.");
			flag = false;
			break;
		}
		
		//main loop continues if all is well
		if(amount > 0)
		{
			//calculation
			for(int i = 1; i<amount; i++)
			{
				x = (Math.random() * 2);
				y = (Math.random() * 2);
				calc = Math.pow((x - 1),2) + Math.pow((y - 1),2);
				if(calc <= 1)
				{
					hits++;
				}
			}

			pi = (4.0*hits)/amount;
			

			//output
			
			cls();
			title("Report table");
			System.out.printf("%18s", "Hits");
			System.out.printf("%18s", "Tries");
			System.out.printf("%18s", "Approx of Pi");
			System.out.println();
			System.out.printf("%18d", hits);
			System.out.printf("%18d", amount);
			System.out.printf("%18f", pi);
			System.out.println();
			System.out.println();
			System.out.println("Press enter to continue");
			
			scanner.nextLine();
		}
		
		
		
		
		}while(flag);//end of loop
		
		scanner.close();
		
	}//end of main
	
	public static void cls()
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}// end of cls
	
	public static void title(String sub)
	{
		System.out.println("Calculate Pi");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title

}
