package CS121;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int x = 0;
		int flag = 0;
		int j = 0; //loop var for screen clear
		String str = ""; //used for pause
		flag = 1;
		

		
		while(flag ==1) 
		{
			
			for(j=1;j<=50;j++) 
			{
				System.out.println();
			}
			System.out.println("Factors");
			System.out.println("By Jonah");
			System.out.println();
			
			System.out.print("Enter the number you would like to find the factors for: ");
			x = in.nextInt();
			in.nextLine();
			
			if(x<0) {
				flag = 0;
			}
			System.out.println();
			if(x>0) 
			{
				
				System.out.println("The factors of " + x + " are:");
				for(i=1;i<x;i++) 
				{
					if(x%i == 0) 
					{
						System.out.println(i + " and " + x/i +" are factors.");
					}
				}
				
				System.out.println();
				System.out.println("Press Enter to continue.");
				str = in.nextLine();
				
			}	
						
		}//end of while loop
		System.out.println("The program has ended");
		in.close();
	}
		
}

