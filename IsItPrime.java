package CS121;

import java.util.Scanner;

public class IsItPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int x = 0;
		int flag = 0;
		
		System.out.println("Enter the number to check if it is prime ");
		x = scanner.nextInt();
		scanner.nextLine();
		System.out.println();
		
		for(i = 2; i < x; i++)
		{
			if(x%i ==0) 
			{
				flag = 1;
				System.out.println(x + " is not a prime number, It can be divided by at least " + i);
				i = x;
			}
			
		}
		
		if(flag == 0)
		{
			System.out.println("The number " + x + " is a prime number");
		}
		
	}

}
