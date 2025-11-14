package CS121;

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int gcf = 0;
		
		//Credits
		System.out.println("Title Here");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println();
		
		//user Inputs
		System.out.print("enter x: ");
		x = scanner.nextInt();
		System.out.print("enter y: ");
		y = scanner.nextInt();
		//Calculations
		for(int i = 1; i <= x || i <= y; i++ ) {
			if(x%i == 0 && y%i == 0) {
				gcf =i;
			}
		}
		
		//Output
		System.out.println(gcf);
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
