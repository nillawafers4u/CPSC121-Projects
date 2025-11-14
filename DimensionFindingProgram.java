package CS121;

import java.util.Scanner;

public class DimensionFindingProgram {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		double length = 0;
		double width = 0;
		double height = 0;
	

		while(flag == 0)
		{
			
			cls();
		
			//Credits
			title("Main Screen");
			
			//Story Line
			System.out.println("This program will ask the user for the length, width and height of a room in feet.");
			System.out.println("If any of the values are negative, then the program will end.");
			System.out.println("You will then see displayed the volume, area, and perimeter of the room.");
			System.out.println();
			
			//user Inputs
			System.out.print("Room length: ");
			length = scanner.nextDouble();
			System.out.println();
			if(length < 0) flag = 1;

			
			if (flag == 0)
			{
				System.out.print("Room width: ");
				width = scanner.nextDouble();
				System.out.println();
				if(width < 0) flag = 1;

			}
			
			if (flag == 0)
			{
				System.out.print("Room height: ");
				height = scanner.nextDouble();
				System.out.println();
				if(height < 0) flag = 1;
			}
			
			if(flag == 0)
			{
				cls();
				System.out.printf("%22s", "Volume (Cubic feet)");
				System.out.printf("%27s", "Floor Area (Square feet)");
				System.out.printf("%26s", "Perimeter (feet)");
				System.out.println();
				System.out.printf("%22.2f", volume(length,height,width));
				System.out.printf("%27.2f", area(length,width));
				System.out.printf("%26.2f", perimeter(length,width));
				System.out.println();
				System.out.println();
				
				scanner.nextLine();
				System.out.println("Press enter to continue...");
				scanner.nextLine();
			}
			
			if(flag == 1)
			{
				cls();
				title("Ending Screen");
				System.out.println("Thanks for using my program!");
				
			}
		
		}
		//Closing scanner
		scanner.close();

	}//end of main
	
	public static double volume(double length, double width, double height)
	{
		return (length * width * height);
	}//end of volume
	
	public static double area(double length, double width)
	{
		return length * width;
	}//end of area
	
	public static double perimeter(double length, double width)
	{
		return (2 * length) + (2 * width);
	}//end of perimeter
	
	public static void cls()
	{
		for(int i = 1; i <50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
	public static void title(String sub)
	{
		System.out.println("Dimension Finding Program");
		System.out.println(sub);
		System.out.println();
		System.out.println("By: Jonah Layman");
		System.out.println();	
	}//end of title
	

}//end of file
