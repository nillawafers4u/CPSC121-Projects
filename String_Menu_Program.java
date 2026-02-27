package CS121;

import java.util.Scanner;

public class String_Menu_Program {

	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		int input = 0;
		int start = 0;
		int pastend = 0;
		String enter = "";
		String strvar = "";
		do {
			cls();
			title("Main Menu");
			System.out.println("1 -> Enter a String");
			System.out.println("2 -> Determine Character at an Index (var.charAt(index))");
			System.out.println("3 -> Determine Index of a Character (var.indexOf(‘....’))");
			System.out.println("4 -> Determine Last Index of a Character (var.lastIndexOf(‘....’))");
			System.out.println("5 -> Print a Section of a String (var.substring(start,pastend))");
			System.out.println("6 -> Print All Characters in Upper Case (var.toUpperCase())");
			System.out.println("7 - exit");
			System.out.println();
			System.out.print("Enter Your Option ");
			enter = in.nextLine();	
		    System.out.println();
			try {
			    input = Integer.parseInt(enter);
			    }
				catch (Exception err ) {
					System.out.println("An error has occured of type: " + err.getMessage());
					enter = "";
					input = 0;
				}
		    switch (input)
		    {
		        case 1:
		        	do
		        	{
		        		cls();
			        	title("Enter a String to be Used in the Program");
			        	System.out.println("Enter the string you would like to use or a '/' for the menu (this will keep the original string.");
			        	enter = in.nextLine();
			        	
			        	if(enter.equals("/"))
			        	{
			        		break;
			        	}
			        	if(!enter.isBlank())
		        		{
			        		strvar = enter;
		        		}
		        	}while(enter.isBlank());
		        	break;
		        	
		        case 2: 
	        		cls();
	        		if(strvar.isBlank())
	        		{
	        			
	        			title("Error: Nothing Entered");
	        			System.out.println("You haven't entered a string yet!");
	        			System.out.println("Enter to return to menu");
	        			in.nextLine();
	        			break;
	        		}
		        	title("Determine Character at an Index (var.charAt(index))");
		        	System.out.println("Enter the integer value of the character you would like to see or '/' for the menu");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	enter = in.nextLine();
		        	if(enter.equals("/"))
		        	{
		        		break;
		        	}
		        	try
		        	{
		        		input = Integer.parseInt(enter);
		        		System.out.println("The character at index " + input + " is " + strvar.charAt(input));
			        	System.out.println("Press enter for the menu");
			        	enter = in.nextLine();
		        	}
		        	catch(Exception err)
		        	{
		        		
		        		String message = "" + err.getStackTrace()[3];
		        		start = message.lastIndexOf(":") + 1;
		        		pastend = message.lastIndexOf(")");
		        		cls();
		        		title("Error Message");
		        		System.out.println("You have entered an invalid input.");
		        		System.out.println("Please enter a number 0 - " + (strvar.length() - 1));
		        		System.out.println();
		        		System.out.println("If you believe you entered a valid input please infom a technicians with 'Error on line " + message.substring(start,pastend) + "'");
		        		System.out.println();
		        		System.out.println("Press enter to continue");
		        		in.nextLine();
		        	}
		        	break;
		        case 3: 
		        	cls();
	        		if(strvar.isBlank())
	        		{
	        			
	        			title("Error: Nothing Entered");
	        			System.out.println("You haven't entered a string yet!");
	        			System.out.println("Enter to return to menu");
	        			in.nextLine();
	        			break;
	        		}
		        	title("Determine Index of a Character (var.indexOf(‘....’))");
		        	System.out.println("Enter the character that you would like to find the index value for or '/' for the menu");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	enter = in.nextLine();
		        	if(enter.equals("/"))
		        	{
		        		break;
		        	}
		        	try
		        	{
		        		if(strvar.contains(enter) && !enter.isBlank())
		        		{
		        			System.out.println("The index for character " + enter + " is " + strvar.indexOf(enter));
				        	System.out.println("Press enter for the menu");
				        	enter = in.nextLine();
				        	break;
		        		}
		        		else throw new Exception();
		        		
		        	}
		        	catch(Exception err)
		        	{
		        		cls();
		        		title("Invalid Input");
		        		System.out.println("Looks like you entered a character not in this string!");
		        		System.out.println("Please enter a character that appears in your string.");
		        		String message = "" + err.getStackTrace()[0];
		        		start = message.lastIndexOf(":") + 1;
		        		pastend = message.lastIndexOf(")");
		        		System.out.println();
		        		System.out.println("If you believe this to be an error, inform your technician that 'an error occured on line " + message.substring(start,pastend) + "'");
		        		System.out.println("Or, press enter to try again");
		        		enter = in.nextLine();
		        	}
		        	break;
		        	
		        case 4: 
		        	cls();
	        		if(strvar.isBlank())
	        		{
	        			
	        			title("Error: Nothing Entered");
	        			System.out.println("You haven't entered a string yet!");
	        			System.out.println("Enter to return to menu");
	        			in.nextLine();
	        			break;
	        		}
		        	title("Determine Last Index of a Character (var.lastIndexOf(‘....’))");
		        	System.out.println("Enter the character that you would like to find the last index value for or '/' for the menu");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	enter = in.nextLine();
		        	if(enter.equals("/"))
		        	{
		        		break;
		        	}
		        	try
		        	{
		        		if(strvar.contains(enter) && !enter.isBlank())
		        		{
		        			System.out.println("The last index for character " + enter + " is " + strvar.lastIndexOf(enter));
				        	System.out.println("Press enter for the menu");
				        	enter = in.nextLine();
				        	break;
		        		}
		        		else throw new Exception();
		        		
		        	}
		        	catch(Exception err)
		        	{
		        		cls();
		        		title("Invalid Input");
		        		System.out.println("Looks like you entered a character not in this string!");
		        		System.out.println("Please enter a character that appears in your string.");
		        		String message = "" + err.getStackTrace()[0];
		        		start = message.lastIndexOf(":") + 1;
		        		pastend = message.lastIndexOf(")");
		        		System.out.println();
		        		System.out.println("If you believe this to be an error, inform your technician that 'an error occured on line " + message.substring(start,pastend) + "'");
		        		System.out.println("Or, press enter to try again");
		        		enter = in.nextLine();
		        	}
		        	break;
		        	
		        case 5: 
		        	cls();
	        		if(strvar.isBlank())
	        		{
	        			
	        			title("Error: Nothing Entered");
	        			System.out.println("You haven't entered a string yet!");
	        			System.out.println("Enter to return to menu");
	        			in.nextLine();
	        			break;
	        		}
		        	title("Print a Section of a String (var.substring(start,pastend))");
		        	System.out.println("Enter the integer value of the character where you would like to start or '/' for the menu");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	enter = in.nextLine();
		        	if(enter.equals("/"))
		        	{
		        		break;
		        	}
		        	try
		        	{
		        		start = Integer.parseInt(enter);
		        		if(start < 0 || start >= strvar.length())
		        		{
		        			enter = "ERROR";
		        		}
		        		start = Integer.parseInt(enter);
		        	}
		        	catch(Exception err)
		        	{
		        		String message = "" + err.getStackTrace()[3];
		        		start = message.lastIndexOf(":") + 1;
		        		pastend = message.lastIndexOf(")");
		        		cls();
		        		title("Error Message");
		        		System.out.println("You have entered a number outside of the string length.");
		        		System.out.println("Please enter a number 0 - " + (strvar.length() - 1));
		        		System.out.println();
		        		System.out.println("If you believe you entered a valid input please infom a technicians with 'Error on line " + message.substring(start,pastend) + "'");
		        		System.out.println();
		        		System.out.println("Press enter to continue");
		        		in.nextLine();
		        		break;
		        	}
		        	
		        	System.out.println();
		        	System.out.println("Enter the integer value for the index of the character pastend or '/' for the menu");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	enter = in.nextLine();
		        	if(enter.equals("/"))
		        	{
		        		break;
		        	}
		        	try
		        	{
		        		pastend = Integer.parseInt(enter);
		        		if(pastend <= start || pastend > strvar.length())
		        		{
		        			enter = "ERROR";
		        		}
		        		pastend = Integer.parseInt(enter);
		        	}
		        	catch(Exception err)
		        	{
		        		String message = "" + err.getStackTrace()[3];
		        		start = message.lastIndexOf(":") + 1;
		        		pastend = message.lastIndexOf(")");
		        		cls();
		        		title("Error Message");
		        		System.out.println("You have entered an invalid ending number.");
		        		System.out.println("Please ensure your second number is greater than the first, and less than or equal to " + (strvar.length() - 1));
		        		System.out.println();
		        		System.out.println("If you believe you entered a valid input please infom a technicians with 'Error on line " + message.substring(start,pastend) + "'");
		        		System.out.println();
		        		System.out.println("Press enter to continue");
		        		in.nextLine();
		        		break;
		        	}
		        	
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("The substring for strvar.substring(" + start +", " + pastend + ") is " + strvar.substring(start, pastend));
		        	System.out.println("Press enter for the menu");
		        	enter = in.nextLine();
		        	break;
		        	
		        case 6: 
		        	cls();
	        		if(strvar.isBlank())
	        		{
	        			
	        			title("Error: Nothing Entered");
	        			System.out.println("You haven't entered a string yet!");
	        			System.out.println("Enter to return to menu");
	        			in.nextLine();
	        			break;
	        		}
		        	title("Print All Characters in Upper Case (var.toUpperCase())");
		        	System.out.println("strvar = " + strvar);
		        	System.out.println("strvar has a length of " + strvar.length());
		        	System.out.println("In all caps it would be: " + strvar.toUpperCase());
		        	System.out.println("Press enter for the menu");
		        	enter = in.nextLine();
		        	break;
		        case 7: 
		        	cls();
		        	System.out.println("That's All Folks");
		        	flag = false;
		            break;
		            
		        default:
		            System.out.println("Choice must be a value between 1 and 7.");
		        	System.out.println("Press Enter to Continue");
		        	enter = in.nextLine();
		        	break;
		    }//end of switch
		} while (flag);
		in.close();
	}//end of main
	public static void cls() {
		for (int i=1;i<=50;i++)
		{
			System.out.println();
		}
	}//end of cls
	public static void title(String n){
		System.out.println("String Manipulation Program");
		System.out.println(n);
		System.out.println("by");
		System.out.println("Dr.K");
		System.out.println();
	}//end of title

}
