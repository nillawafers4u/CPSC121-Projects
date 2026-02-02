package CS121;

import java.util.Scanner;

public class Search_Example {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] Names = {" ","Joe", "Katie", "Gail", "Andrew","Denise","Sharon","Jerry","Saundra","Joe"};
		int cnt = 9;
		int input = 0;
		int found = 0;//this will be our index variable
		int i = 0;
		String enter = "";
		do {
			cls();
			title("Main Menu");
			System.out.println("1 - List of Items in the Array");
			System.out.println("2 - Search Using .equal");
			System.out.println("3 - Search Using .contains");
			System.out.println("4 - Search Using .contains and toUpperCase");
			System.out.println("5 - Quit");
			System.out.println();
			System.out.print("Enter your option: ");
			enter = in.nextLine();
			try {
			input = Integer.parseInt(enter);
			}
			catch (Exception err ) {
				input = 6;
			}
			switch (input)
			{
			case 1: 
				cls();
				title("List of Items in the Array");
				System.out.println("Here is the list of " + cnt + " names that I have created.");
				// display the names
				System.out.println();
				for (i=1;i<=cnt;i=i+1)
				{
					System.out.println(i + ".) " +  Names[i]);
				}
				System.out.println();
				System.out.println("Press enter to return to the menu");
				enter = in.nextLine();
				break;
			case 2:
				do {
					cls();
					title("Search Using .equal");
					System.out.println("You will enter a name or characters to find and I will search through the array for you. Enter a / for the menu.");
					System.out.print("Name or Characters: ");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
					found = 0;
					for (i=1;i<=cnt;i=i+1)
					{
						if (enter.equals(Names[i]))
						{
							System.out.println("I found " + Names[i] + " at cell " + i);
							found = i;
						}
					}
					if (found == 0)
					{
						System.out.println("No items found.");
					}
					System.out.println("Press enter to continue");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
				}while(true);
				break;
			case 3: 
				do {
					cls();
					title("Search Using .contains");
					System.out.println("You will enter a name or characters to find and I will search through the array for you. Enter a / for the menu.");
					System.out.print("Name or Characters: ");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
					found = 0;
					for (i=1;i<=cnt;i=i+1)
					{
						if (Names[i].contains(enter))
						{
							System.out.println("I found " + Names[i] + " at cell " + i);
							found = i;
						}
					}
					if (found == 0)
					{
						System.out.println("No items found.");
					}
					System.out.println("Press enter to continue");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
				}while(true);
				break;
			case 4:
				do {
					cls();
					title("Search Using .contains and toUpperCase");
					System.out.println("You will enter a name or characters to find and I will search through the array for you. Enter a / for the menu.");
					System.out.print("Name or Characters: ");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
					found = 0;
					for (i=1;i<=cnt;i=i+1)
					{
						if (Names[i].toUpperCase().contains(enter.toUpperCase()))
						{
							System.out.println("I found " + Names[i] + " at cell " + i);
							found = i;
						}
					}
					if (found == 0)
					{
						System.out.println("No items found.");
					}
					System.out.println("Press enter to continue");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						break;
					}
				}while(true);
				break;
			case 5:
			// quit program
				cls();
				System.out.println("That's All Folks!");
				break;
			default:
					cls();
					title("Input Error");
					System.out.println("Your entry must be between 1 and 5.");
					System.out.println("Press Enter to continue.");
					enter = in.nextLine();
			}
		} while (input != 5);
		in.close();
	}//end of main
	public static void cls() {
		for (int i=0;i<50;i = i + 1)
		{
			System.out.println();
		}
	}//end of cls
	public static void title(String n){
		System.out.println("Sequential Search Example");
		System.out.println(n);
		System.out.println("by");
		System.out.println("Dr.K");
		System.out.println();
	}//end of title and credits
}//end of class
