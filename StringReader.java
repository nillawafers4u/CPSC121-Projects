package CS121;

import java.util.Scanner;

public class StringReader {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		int num1 = 0;
		System.out.println("String Reader");
		System.out.println("by: Jonah Layman");
		System.out.println();
		System.out.print("Please enter a string: ");
		str = input.nextLine();
		System.out.print("Please enter a number: ");
		num1 = input.nextInt();
		System.out.println("You entered a string of: " + str + " and a value of: " + num1);
		input.close();
		
		
		//is scanner.nextLine(); buffer thing a limitation or a feature of Java?
		
	}//end of class

}//end of file
