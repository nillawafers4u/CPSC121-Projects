package CS121;

import java.util.Scanner;

public class CS121Final {

	public static void main(String[] args) {
		String userInput = "";
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		boolean mainFlag = true;
		boolean littleFlag = true;
		double x = 0.0;
		double y = 0.0;
		/*
	    Convert Ounces to Grams
	    Convert Grams to Ounces
	    Convert Pounds to Kilograms
	    Convert Kilograms to Pounds
	    Convert Inches to Centimeters
	    Convert Centimeters to Inches
	    Convert Miles to Kilometers
	    Convert Kilometers to Miles
	    Quit
	    
	    1 ounce = 28.35 grams

		2.205 pounds = 1 kilogram
		
		1 inch = 2.55 centimeters
		
		0.6214 miles = 1 kilometer
			 */
		do 
		{
		
			cls();
			title("Main Menu");
			littleFlag = true;
			
			System.out.println("This program will let you choose a conversion");
			System.out.println("Once inside the appropriate subsection you will be asked for you amount to convert");
			System.out.println("enter your number, and see the conversion. Enter '-1' to return to main menu");
			System.out.println();
			
			System.out.println("1 - Convert Ounces to Grams");
			System.out.println("2 - Convert Grams to Ounces");
			System.out.println("3 - Convert Pounds to Kilograms");
			System.out.println("4 - Convert Kilograms to Pounds");
			System.out.println("5 - Convert Inches to Centimeters");
			System.out.println("6 - Convert Centimeters to Inches");
			System.out.println("7 - Convert Miles to Kilometers");
			System.out.println("8 - Convert Kilometers to Miles");
			System.out.println("9 - Quit");
			System.out.println();
			System.out.print("Enter your Choice: ");
			
			userInput = scanner.nextLine();
			try 
			{
				choice = Integer.parseInt(userInput);
			}
			catch(Exception err)
			{
				choice = -2;
			}
		
			switch(choice)
			{
				case 1:
					do
					{
						cls();
						title("Convert Ounces to Grams");
						System.out.println();
						System.out.println("Please enter the amount of Ounces to convert, ");
						System.out.print("or a negative number to return to menu: ");
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								y = x * 28.35;
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Ounces");
								System.out.printf("%16s", "Grams");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 1
					
				case 2:
					do
					{
						cls();
						title("Convert Grams to Ounces");
						System.out.println();
						System.out.println("Please enter the amount of Grams to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								y = x * (1/28.35);
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Grams");
								System.out.printf("%16s", "Ounces");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 2
				
				case 3:
					do
					{
						cls();
						title("Convert Pounds to Kilograms");
						System.out.println();
						System.out.println("Please enter the amount of Pounds to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//2.205 pounds = 1 kilogram
								y = x * (1/2.205);
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Pounds");
								System.out.printf("%16s", "Kilograms");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 3
					
				case 4:
					do
					{
						cls();
						title("Convert Kilograms to Pounds");
						System.out.println();
						System.out.println("Please enter the amount of Kilograms to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//2.205 pounds = 1 kilogram
								y = x * 2.205;
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Kilograms");
								System.out.printf("%16s", "Pounds");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 4
					
				case 5:
					do
					{
						cls();
						title("Convert Inches to Centimeters");
						System.out.println();
						System.out.println("Please enter the amount of Inches to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//1 inch = 2.55 centimeters
								y = x * 2.55;
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Inches");
								System.out.printf("%16s", "Centimeters");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 5
					
				case 6:
					do
					{
						cls();
						title("Convert Centimeters to Inches");
						System.out.println();
						System.out.println("Please enter the amount of Centimeters to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//1 inch = 2.55 centimeters
								y = x * (1/2.55);
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Centimeters");
								System.out.printf("%16s", "Inches");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 6
					
				case 7:
					do
					{
						cls();
						title("Convert Miles to Kilometers");
						System.out.println();
						System.out.println("Please enter the amount of Miles to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//0.6214 miles = 1 kilometer
								y = x * (1/0.6214);
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Miles");
								System.out.printf("%16s", "Kilometers");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 7
					
				case 8:
					do
					{
						cls();
						title("Convert Kilometers to Miles");
						System.out.println();
						System.out.println("Please enter the amount of Kilometers to convert, ");
						System.out.print("or a negative number to return to menu: ");
						//conversion method
						try
						{
							x = Double.parseDouble(userInput = scanner.nextLine());
							
							if(x<0)
							{
								littleFlag = false;
								break;
							}
							
							else
							{
								//0.6214 miles = 1 kilometer
								y = x * 0.6214;
								cls();
								title("Result");
								System.out.println();
								System.out.println("Your Conversion Outputs:");
								System.out.println();
								System.out.printf("%16s", "Kilometers");
								System.out.printf("%16s", "Miles");
								System.out.println();
								System.out.printf("%16.4f", x);
								System.out.printf("%16.4f", y);
								System.out.println();
								System.out.println();
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							}
							
						}
						catch(Exception err)
						{
							cls();
							System.out.println("Looks like you didn't enter a number...");
							System.out.println("Press enter to continue");
							scanner.nextLine();
						}
						
						
						
						
					}while(littleFlag);
					break;
					//end of case 8
					
				case 9:
					do
					{
						cls();
						title("Exit");
						System.out.println();
						System.out.println("Thanks for using my program! Goodbye.");
						mainFlag = false;
						break;
					}while(true);
					break;
					//end of case 9
					
					
				default:
					cls();
					System.out.println("Unrecognized option, please pick an option (1-9)");
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
					//end of default
			}
			
		}while (mainFlag);
		
		scanner.close();


	}//end of main
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
	public static void title(String sub)
	{
		System.out.println("Super Converter Program");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title
}
