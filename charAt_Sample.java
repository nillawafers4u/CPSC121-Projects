package CS121;

import java.util.Scanner;

public class charAt_Sample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the line of text to code: ");
		String input = in.nextLine();
		int len = input.length();
		char x = ' ';
		int c = 0;
		for (int i = 0; i < len ; i++)
			{
				x = input.charAt(i);
				c = (int) x;
			//hello	System.out.println("The character is " + x + " the ASC value is " + c);
				System.out.printf("%5s",x);
			}
		
		System.out.println();
		for (int i = 0; i < len ; i++)
			{
				x = input.charAt(i);
				c = (int) x;
				System.out.printf("%5d",c);
			}
			
		System.out.println();
		System.out.print("Please enter the ASC value of the character you would like.  Note that this will be entered as a string. ");
		input = in.nextLine();
		in.close();
		c = Integer.parseInt(input);
		x = (char) c;
		System.out.println("The original ASC value was "+ input);
		System.out.println("The character is "+ x);

	}

}
