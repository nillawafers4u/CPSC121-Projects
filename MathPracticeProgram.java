package CS121;

import java.util.Scanner;

public class MathPracticeProgram {

	public static void main(String[] args) {
		//defining our variables to keep track of scores.
		Scanner scanner = new Scanner(System.in);
		int totalAdd = 0;
		int correctAdd = 0;
		int totalSub = 0;
		int correctSub = 0;
		int totalMul = 0;
		int correctMul = 0;
		int totalDiv = 0;
		int correctDiv = 0;
		int answer = 0;
		int input = 0;
		int userAnswer = 0;
		String userIn = "";
		boolean flag = true;
		
		//Main loop start
		do 
		{
		
			cls();
			title("Main Menu");

			System.out.println("1 - Addition");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplicaiton");
			System.out.println("4 - Division");
			System.out.println("5 - Report Card");
			System.out.println("6 - Quit");
			System.out.print("Enter your selection (1-6) ");
			
			try 
			{
				input = scanner.nextInt();
			}
			catch(Exception err)
			{
				input = 9;
			}
			
			scanner.nextLine();
		
			switch(input)
			{
				case 1:
					flag = true;
					
					do
					{
						cls();
						title("Addition");
						
						//call method for the print
						answer = additionProblem();
						totalAdd++;
						
						//logic to decide where to place cursor
						if(answer > 9)
						{
							System.out.print("   ");
						}
						else
						{
							System.out.print("    ");
						}
						
							
						try 
						{
							userAnswer = scanner.nextInt();
						}
						catch(Exception err)
						{
							System.out.println("Error, not a number, counting as an incorrect answer...");
							userAnswer = -1;
						}

						
						
						scanner.nextLine();
						System.out.println();
						
						//logic for deciding if userAnswer is correct
						
						if(userAnswer == answer)
						{
							System.out.println("Well done, You got it right!");
							correctAdd++;
							System.out.println();
						}
						else
						{
							System.out.println("Sorry, that's not quite right!");
							System.out.println("the correct answer was: " + answer);
							System.out.println();
						}
						
						System.out.println("Press enter to solve another, or '/' to quit");
						userIn = scanner.nextLine();
						if(userIn.equals("/"))
						{
							flag = false;
						}
						
					} while(flag);

					break;
				case 2:
					flag = true;
					
					do
					{
						cls();
						title("Subtraction");
						
						//call method generating problem
						answer = subtractionProblem();
						totalSub++;
						
						//logic to decide where to place cursor
						if(answer > 9)
						{
							System.out.print("   ");
						}
						else
						{
							System.out.print("    ");
						}
						
						try 
						{
							userAnswer = scanner.nextInt();
						}
						catch(Exception err)
						{
							System.out.println("Error, not a number, counting as an incorrect answer...");
							userAnswer = -1;
						}
						
						scanner.nextLine();
						System.out.println();
						
						//logic for deciding if userAnswer is correct
						
						if(userAnswer == answer)
						{
							System.out.println("Well done, You got it right!");
							correctSub++;
							System.out.println();
						}
						else
						{
							System.out.println("Sorry, that's not quite right!");
							System.out.println("the correct answer was: " + answer);
							System.out.println();
						}
						
						System.out.println("Press enter to solve another, or '/' to quit");
						userIn = scanner.nextLine();
						if(userIn.equals("/"))
						{
							flag = false;
						}
						
					} while(flag);

					break;
				case 3:
					//multiplication
					flag = true;
					
					do
					{
						cls();
						title("Multiplication");
						
						//call method for the print
						answer = multiplicationProblem();
						totalMul++;
						
						//logic to decide where to place cursor
						if(answer > 9)
						{
							System.out.print("   ");
						}
						else
						{
							System.out.print("    ");
						}
						
						try 
						{
							userAnswer = scanner.nextInt();
						}
						catch(Exception err)
						{
							System.out.println("Error, not a number, counting as an incorrect answer...");
							userAnswer = -1;
						}
						
						scanner.nextLine();
						System.out.println();
						
						//logic for deciding if userAnswer is correct
						
						if(userAnswer == answer)
						{
							System.out.println("Well done, You got it right!");
							correctMul++;
							System.out.println();
						}
						else
						{
							System.out.println("Sorry, that's not quite right!");
							System.out.println("the correct answer was: " + answer);
							System.out.println();
						}
						
						System.out.println("Press enter to solve another, or '/' to quit");
						userIn = scanner.nextLine();
						if(userIn.equals("/"))
						{
							flag = false;
						}
						
					} while(flag);

					break;
				case 4:
					flag = true;
					
					do
					{
						cls();
						title("Division");
						
						//call method for the print
						answer = divisionProblem();
						totalDiv++;
						
						try 
						{
							userAnswer = scanner.nextInt();
						}
						catch(Exception err)
						{
							System.out.println("Error, not a number, counting as an incorrect answer...");
							userAnswer = -1;
						}
						
						scanner.nextLine();
						System.out.println();
						
						//logic for deciding if userAnswer is correct
						
						if(userAnswer == answer)
						{
							System.out.println("Well done, You got it right!");
							correctDiv++;
							System.out.println();
						}
						else
						{
							System.out.println("Sorry, that's not quite right!");
							System.out.println("the correct answer was: " + answer);
							System.out.println();
						}
						
						System.out.println("Press enter to solve another, or '/' to quit");
						userIn = scanner.nextLine();
						if(userIn.equals("/"))
						{
							flag = false;
						}
						
					} while(flag);

					break;
				case 5:
					cls();
					System.out.printf("%37s", "Math  Practice");
					System.out.println();
					System.out.printf("%36s","Report  Card");
					System.out.println();
					System.out.printf("%38s", "By: Jonah Layman");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.printf("%15s%15s%15s%15s", "Subject", "Correct", "Total", "Percent");
					System.out.println();
					
					//printing the results
					reportCalc("Addition", correctAdd, totalAdd);
					reportCalc("Subtraction", correctSub, totalSub);
					reportCalc("Multiplication", correctMul, totalMul);
					reportCalc("Division", correctDiv, totalDiv);
					
					
					System.out.println();
					System.out.println();
					System.out.printf("%43s","Press enter to continue...");
					System.out.println();
					scanner.nextLine();
					break;
				case 6:
					cls();
					System.out.println("Thanks for using the program!");
					System.out.println("Shutting down . . .");
					break;
				default:
					cls();
					System.out.println("Unrecognized option, please pick 1-6");
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
			}//end of switch
		}while(input!=6);//end of do while loop
		
		scanner.close();
	}// end of main
	
	public static void cls()
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}// end of cls
	
	public static void title(String sub)
	{
		System.out.println("Math Practice");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title
	
	public static void reportCalc(String subject, int correct, int total)
	{
		System.out.printf("%15s", subject);
		System.out.printf("%15d", correct);
		System.out.printf("%15d", total);
		
		if(total == 0)
		{
			System.out.printf("%15s", "N/A");
		}
		else
		{
			System.out.printf("%15.1f", (correct * 100.0 / total));
		}
		System.out.println();
	}//end of reportCalc
	
	public static int additionProblem()
	{
		
		int ran1 = (int) (Math.random() * 16);
		int ran2 = (int) (Math.random() * 16);
		//if the top number is less than the bottom, we swap
		if(ran1 < ran2)
		{
			int temp = ran1;
			ran1 = ran2;
			ran2 = temp;
		}
		System.out.print(" ");
		System.out.printf("%4s", ran1);
		System.out.println();
		System.out.print("+");
		System.out.printf("%4s", ran2);
		System.out.println();
		System.out.println("-------");
		
		return ran1+ran2;
		
		
	}//end of additionProblem
	
	public static int subtractionProblem()
	{
		//if the top number is less than the bottom, we swap
		int ran1 = (int) (Math.random() * 16);
		int ran2 = (int) (Math.random() * 16);
		
		//call method for the print
		
		if(ran1 < ran2)
		{
			int temp = ran1;
			ran1 = ran2;
			ran2 = temp;
		}
		System.out.print(" ");
		System.out.printf("%4s", ran1);
		System.out.println();
		System.out.print("-");
		System.out.printf("%4s", ran2);
		System.out.println();
		System.out.println("-------");
		
		return ran1-ran2;
	}//end of subtraction
	
	public static int divisionProblem()
	{
		
		int y = (int) ((Math.random() * 11) + 1);
		int answer = (int) (Math.random() * 12);
		int x = y * answer;
		
		System.out.print(x + " / " + y + " = ");

		
		return answer;
		
		
	}//end of DivisionProblem
	
	public static int multiplicationProblem()
	{
		
		int ran1 = (int) (Math.random() * 13);
		int ran2 = (int) (Math.random() * 13);
		//if the top number is less than the bottom, we swap
		if(ran1 < ran2)
		{
			int temp = ran1;
			ran1 = ran2;
			ran2 = temp;
		}
		System.out.print(" ");
		System.out.printf("%4s", ran1);
		System.out.println();
		System.out.print("*");
		System.out.printf("%4s", ran2);
		System.out.println();
		System.out.println("-------");
		
		return ran1*ran2;
		
		
	}//end of additionProblem
	

}// end of class
