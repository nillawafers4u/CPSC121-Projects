package CS121;

import java.util.Scanner;

public class Error_Message {
	
	public static void main(String[] args) 
	{
		
		//error trap each section (dont worry about main menu)
		//if an error occurs, tell the user what went wrong.
		//tell them what they needed to do.
		//give them the info for tech support "Let tech know the error occured on line ___"
		//create document file to report to your boss
		
		Scanner input = new Scanner(System.in);
		String enter = "";
		String message = "";
		int in = 0;
		int i = 0;
		int len = 0;
		int start = 0;
		int end = 0;
		do {
			cls();
			title("Main Menu");
			System.out.println("1 -> Option 1");
			System.out.println("2 -> Option 2");
			System.out.println("3 -> Quit");
			System.out.println();
			System.out.print("Enter Your Option ");
			enter = input.nextLine();
		    //Error Messages being trapped
		    try
		    {
		    	//code to trap goes here
		    	in = Integer.parseInt(enter);
		    }
		    catch(Exception err)
		    {
		    	System.out.println("This is what you see if you display err.getMessage(): ");
		    	System.out.println(err.getMessage());
		    	System.out.println("This is what you see if you display err: ");
		    	System.out.println(err);
		    	System.out.println("This is what you see if you display err.getStackTrace()[3]:");
		    	System.out.println(err.getStackTrace()[3]);
		    	System.out.println("This is what you see if you display err.getStackTrace()[2]:");
		    	System.out.println(err.getStackTrace()[2]);
		    	System.out.println("This is what you see if you display err.getStackTrace()[1]:");
		    	System.out.println(err.getStackTrace()[1]);
		    	System.out.println("This is what you see if you display err.getStackTrace()[0]:");
		    	System.out.println(err.getStackTrace()[0]);
		    	System.out.println("This is what you see if you err.printStackTrace()");
		    	err.printStackTrace();
		    	System.out.println("Press Enter to Continue");
		    	enter = input.nextLine();
		    	message = "" + err.getStackTrace()[3];
		    	len = message.length();
		    	start = message.lastIndexOf(":") + 1;
		    	end = len - 1;
		    	System.out.println("The Error Occurred on line: " + message.substring(start,end));
		    	in = -1;
		    }
		    switch (in)
		    {
		        case 1:
		            // do something
		        	cls();
		        	title("Option 1");
		        	System.out.println("Press Enter to Continue");
		        	enter = input.nextLine();
		            break;
		        case 2: 
		            // ..something else
		        	cls();
		        	title("Option 2");
		        	System.out.println("Press Enter to Continue");
		        	enter = input.nextLine();
		            break;
		        case 3: 
		            // .. exit program
		        	cls();
		        	System.out.println("That's All Folks");
		        	break;         
		        default:
		            System.out.println("Choice must be a value between 1 and 3.");
		            System.out.println("Press Enter to Continue");
		            enter = input.nextLine();
		            break;
		    } // end of switch
		} while (in != 3);
	}//end of main	
	
	
	public static void cls() {
		for (int i=0;i<50;i = i + 1)
		{
			System.out.println();
		}
		
		
	}//end of cls
	public static void title(String n){
		System.out.println("Study Guide Program");
		System.out.println(n);
		System.out.println("by");
		System.out.println("Dr.K");
		System.out.println();
	}//end of title and credits

}
