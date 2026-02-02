package CS121;

import java.io.*;
import java.util.Scanner;


public class StudyGuideProgram {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		double correct = 0;
		double total = 0;
		String userInput = "";
		String userChoice = "";
		String questions[][] = new String[101][6];
		int choice = 0;
		boolean flag = true;
		//miniFlag is used within cases where we need a loop for user input
		boolean miniFlag = true;
		//evenMinierFlag used for switches within switches.....
		boolean evenMinierFlag = true;
		questions[0][1] = "No questions have been entered";

		
		do 
		{
		
			cls();
			title("Main Menu");
			miniFlag = true;
			
			System.out.println("1 - Add Questions");
			System.out.println("2 - Edit Questions");
			System.out.println("3 - Delete Quesitons");
			System.out.println("4 - Practice");
			System.out.println("5 - Report Menu");
			System.out.println("6 - Save Data");
			System.out.println("7 - Load Data");
			System.out.println("8 - Quit");
			System.out.println();
			System.out.print("Enter your option: ");
			
			userInput = scanner.nextLine();
			try 
			{
				choice = Integer.parseInt(userInput);
			}
			catch(Exception err)
			{
				choice = -2;
			}
			
			cls();
			
			switch(choice) 
			{
				case 1:
					do 
					{
						cls();
						title("Add Questions");
						System.out.println("--------------------------Instructions--------------------------");
						System.out.println("Enter a question, Followed by 1 correct answer, and 3 wrong ones");
						System.out.println("Additionally you may enter '/' at any time to return to the menu");
						System.out.println("----------------------------------------------------------------");
					    System.out.println();
						System.out.println("Last questions added: " + questions[cnt][1]);
						//for loop to make this case smaller and more readable.
						for(int i = 1; i <= 5; i++)
						{
							System.out.println();
							if(i == 1)
							{
								System.out.print("Enter question " + (cnt +1) + ": ");
							}
							if(i == 2)
							{
								System.out.print("Enter the correct answer: ");
							}
							if(i > 2)
							{
								System.out.print("Enter wrong answer " + (i-2) + ": ");
							}
							userChoice = scanner.nextLine();
							if(userChoice.equals("/"))
							{
								miniFlag = false;
								i = 5;
							}
							questions[0][i] = userChoice;
							
						}
						if(!miniFlag)
						{
							miniFlag = false;
							break;
						}
						
						//increase cnt and copy data to main array
						cnt = cnt + 1;
						for(int i = 1; i <= 5; i++)
						{
							questions[cnt][i] = questions[0][i];
						}
					}while(miniFlag);
					break;//end of case 1
					
				case 2:
					do
					{
						cls();
						title("Edit Option");
						int found = 0;
						
						
						//user input and scanning for question
						System.out.print("Enter part of the question you wish to edit, or '/' for menu: ");
						System.out.println();
						userChoice = scanner.nextLine();
						if(userChoice.equals("/"))
						{
							break;
							//get out of loop to exit
						}
						
						for(int k=1; k<=cnt; k++)
						{
							if(questions[k][1].contains(userChoice))
							{
								cls();
								System.out.println(questions[k][1]);
								System.out.println();
								System.out.print("Is this the correct item? (y/n): ");
								//dummy array variable to log the user's yes or no
								questions[0][1] = scanner.nextLine();
								if(questions[0][1].equals("/"))
								{
									k=cnt;
									found = -1;
								}
								if(questions[0][1].toLowerCase().equals("y"))
								{
									found = k;
									for(int i=1; i<=5; i++)
									{
										cls();
										title("Edit Option");
										System.out.println("Question/answer overview:");
										for(int j=1; j<=5; j++)
										{
											System.out.println(questions[found][j]);
										}
										System.out.println();
										System.out.println("Currently editing:");
										System.out.println(questions[found][i]);
										System.out.println();
										System.out.print("Enter replacment (leave blank to accept original): ");
										userChoice = scanner.nextLine();
										if(userChoice.equals("/"))
										{
											i=5;
											k=cnt;
											found = -1;
										}
										if(!userChoice.isEmpty() && found>0)
										{
											questions[found][i] = userChoice;
											k=cnt;
										}
										
										System.out.println();
									}
								}
							}
						}//end of for

						//nothing found...
						if(found == 0)
						{
							System.out.println("No item was found.");
							System.out.println("Press enter to continue...");
							scanner.nextLine();
						}
						if(found == -1)
						{
							miniFlag = false;
						}
					}while(miniFlag);//end of do loop
					break;//end of case 2
	
				case 3:
					do
					{
						cls();
						title("Delete Option");
						int found = 0;
						
						
						//user input and scanning for question
						System.out.print("Enter part of the question you wish to delete, or '/' for menu: ");
						System.out.println();
						userChoice = scanner.nextLine();
						if(userChoice.equals("/"))
						{
							break;
							//get out of loop to exit
						}
						
						for(int k=1; k<=cnt; k++)
						{
							if(questions[k][1].contains(userChoice))
							{
								cls();
								System.out.println(questions[k][1]);
								System.out.println();
								System.out.print("Is this the correct item? (y/n): ");
								//dummy array variable to log the user's yes or no
								questions[0][1] = scanner.nextLine();
								if(questions[0][1].equals("/"))
								{
									k=cnt;
									found = -1;
								}
								if(questions[0][1].toLowerCase().equals("y"))
								{
									//confirmation
									cls();
									System.out.println(questions[k][1]);
									System.out.println();
									System.out.print("Are you SURE you wish to delete this questions and its answers? (y/n): ");
									questions[0][2] = scanner.nextLine();
									if(questions[0][2].equals("/"))
									{
										k=cnt;
										found = -1;
									}
									if(questions[0][2].toLowerCase().equals("y"))
									{
										found = k;
										k = cnt;
									}
									
								}
							}
						}//end of for
						
						
						//removal logic
						if(found == 0)
						{
							System.out.println("No item was found.");
							System.out.println("Press enter to continue...");
							scanner.nextLine();
						}
						if(found >= 1)
						{
							for(int i = found; i<=cnt; i++)
							{
								for(int k = 1; k<=3; k++)
								{
									questions[i][k] = questions[i+1][k];
								}
							}
							cnt --;
						}
						
						if(found == -1)
						{
							miniFlag = false;
						}
					}while(miniFlag);//end of do loop
					break;//end of case 3
					
				case 4:
					int x = (int) (Math.random() * cnt + 1);
					int[] temp = new int[4]; 
					for (int i = 1; i<=4; i++)
					{
						temp[i] = 0;
					}
					int i = 1;
					do
					{
						int y = (int) (Math.random() * cnt + 1);
						int found  = 0;
						for (int j = 1; j <= i; j++)
						{
							if(temp[j] == y)
							{
								found = 1;
								j = i;
							}
						}
						if(found == 0)
						{
							temp[i] = y;
							i++;
						}
					}while(i<5);
					//eventual practice case
					System.out.println("========================================\n"
									  +"|                                      |\n"
									  +"|           Work in progress!          |\n"
									  +"|                                      |\n"
									  +"========================================");
					System.out.println();
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;//end of case 4
					
				case 5:
					do
					{
						cls();
						choice = 0;
						evenMinierFlag = true;
						title("Report Menu");
						System.out.println("Which report option would you like to see?");
						System.out.println();
						System.out.println("1. List the currently stored questions");
						System.out.println("2. Show report card");
						System.out.println("3. Return to menu");
						System.out.println();
						System.out.print("Please enter your choice: ");
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
							cls();
							title("Report");
							if(cnt == 0)
							{
								System.out.println("There isn't currently any saved questions");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
								break;
							}
							for(int k = 1; k <=cnt; k++)
							{
								if(k % 5 == 0)
								{
									System.out.println(((cnt-k) + 1) + " more questions/answers...");
									System.out.println("Press enter to contiune, or '/' to stop");
									userChoice = scanner.nextLine();
									if(userChoice.equals("/"))
									{
										break;
									}
								}
								System.out.println("Question " + k + " - " + questions[k][1]);
								System.out.println("Correct answer - " + questions[k][2]);
								System.out.println("Wrong answer 1 - " +  questions[k][3]);
								System.out.println("Wrong answer 2 - " +  questions[k][4]);
								System.out.println("Wrong answer 3 - " +  questions[k][5]);
								System.out.println();
							}		
							System.out.println("Report End, Press enter to return to menu.");
							scanner.nextLine();
							break;//end of case 5
							
							
							
						case 2:
							reportCard(correct,total);
							System.out.println();
							System.out.println("Press enter to return to menu...");
							scanner.nextLine();
							break;
							
						case 3:
							evenMinierFlag = false;
							break;
						default:
							cls();
							System.out.println("Not a valid input, please choose 1-3");
							scanner.nextLine();
						}
					}while(evenMinierFlag);
					break;
					
				case 6: //save function of program	
					do 
					{	
						cls();
						System.out.println("Are you sure you wish to save? Previous data will be lost!");
						System.out.print("Y/N: ");
						userChoice = scanner.nextLine();
						
						switch(userChoice)
						{
							case "y":
							{
								cls();
								questions = save(questions, cnt);
								System.out.println();
								System.out.println("Your data was saved successfully!");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							case "n":
							{
								cls();
								System.out.println("You have chosen NOT to save.");
								System.out.println("You may now press enter to return to the menu.");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							default:
							{
								cls();
								System.out.println("you've entered an unrecognized input");
								System.out.println("please enter Y or N.");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							} break;
						}//end of Y/N switch
					} while(miniFlag); //end of do loop
					break; //end of case 6
					
				case 7: //load function of program
					do 
					{	
						cls();
						System.out.println("Are you sure you wish to load? Any unsaved data will be lost!");
						System.out.print("Y/N: ");
						userChoice = scanner.nextLine();
						
						//Just felt like using another switch instead of if statements
						switch(userChoice)
						{
							case "y":
							{
								cls();
								questions = load(questions);
								cnt = Integer.parseInt(questions[0][0]);
								System.out.println();
								System.out.println("Your data was loaded successfully!");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							case "n":
							{
								cls();
								System.out.println("You have chosen NOT to load.");
								System.out.println("You may now press enter to return to the menu.");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							default:
							{
								cls();
								System.out.println("you've entered an unrecognized input");
								System.out.println("please enter Y or N.");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							} break;
						} //end of Y/N switch
					} while(miniFlag); //end of do loop
					break; //end of case 6
					
				case 8:
					do 
					{	
						cls();
						System.out.println("Do you want to save before exiting?");
						System.out.println("Any unsaved data will be lost!");
						System.out.print("Y/N: ");
						userChoice = scanner.nextLine();
						
						//Just felt like using another switch instead of if statements
						switch(userChoice)
						{
							case "y":
							{
								cls();
								questions = save(questions, cnt);
								System.out.println();
								System.out.println("Your data was saved successfully!");
								System.out.println("Thanks for using the program!");
								System.out.println("(Press enter to finish shutdown)");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							case "n":
							{
								cls();
								System.out.println("You have chosen NOT to save your data.");
								System.out.println("Hope you didn't lose anything...");
								System.out.println();
								System.out.println("Thanks for using my program!");
								System.out.println("(Press enter to finish shutdown)");
								scanner.nextLine();
								miniFlag = false;
							} break;
							
							default:
							{
								cls();
								System.out.println("you've entered an unrecognized input");
								System.out.println("please enter Y or N.");
								System.out.println("Press enter to continue...");
								scanner.nextLine();
							} break;
							
						} //end of Y/N switch
					} while(miniFlag); //end of do loop
					flag = false;
					break; // end of case 8
					
				default:
					System.out.println("Looks like you havne't entered a valid option.");
					System.out.println("Please try again!");
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
				
			}//end of switch
			
		} while (flag); //end of main loop

		scanner.close();//closing scanner
		
	} //end of main

	
	//Method for saving data from text file
	public static String[][] save(String[][] array, int cnt) throws FileNotFoundException
	{
		PrintWriter fileWrite = new PrintWriter("questions.txt");
		fileWrite.println(cnt);
		for (int i = 1; i <= cnt; i++)
		{
			for (int j = 1; j<=5; j++)
			{
				fileWrite.println(array[i][j]);
			}
		}
		
		fileWrite.close();
		return array;
		
	}//end of save
	
	//Method for loading data from text file
	public static String[][] load(String[][] array) throws FileNotFoundException
	{
		File fileLoad = new File("questions.txt");
		Scanner fileReader = new Scanner(fileLoad);
		
		//takes first number for cnt
		array[0][0] = fileReader.nextLine();
		int cnt = 0;
		
		try
		{
			cnt = Integer.parseInt(array[0][0]);
		}
		catch(Exception ex)
		{
			cnt = -1;
		}
		
		for (int i = 1; i <= cnt; i++)
		{
			for (int j = 1; j<=5; j++)
			{
				array[i][j] = fileReader.nextLine();
			}
		}
		
		fileReader.close();
		return array;
	}//end of load
	
	
	public static void reportCard(double correct, double total)
	{
		cls();
		title("Report Card Display");
		System.out.printf("%12s", "Correct");
		System.out.printf("%12s", "Incorrect");
		System.out.printf("%12s", "Total");
		System.out.printf("%12s","Percent");
		System.out.println();
		System.out.printf("%12.0f", correct);
		System.out.printf("%12.0f", total-correct);
		System.out.printf("%12.0f", total);
		
		if(total == 0)
		{
			System.out.printf("%12s", "N/A");
		}
		else
		{
			System.out.printf("%12.2f", (correct/total)*100);
		}
		System.out.println();
	}
	
	
	
	public static void title(String sub)
	{
		System.out.println("Ultimate Study Program");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
} // end of class
