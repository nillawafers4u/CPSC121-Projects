package CS121;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileSort {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		String textList[] = new String[1001];
		double[] timeHolder = new double[1];
		int cnt = 0;
		boolean mainFlag = true;
		String userInput = "";
		int choice = 0;
		
		do
		{
			cls();
			title("Instructions");
			System.out.println("1 - Read the Text File - text.txt");
			System.out.println("2 - Sort the File");
			System.out.println("3 - Quit");
			System.out.println();
			System.out.print("Please enter your option:");
			
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
				//load file into array and print
				cls();
				title("Load and Print Option");
				textList = load();
				cnt = Integer.parseInt(textList[0]);		
				printer(textList,cnt);
				System.out.println("Press enter to continue...");
				scanner.nextLine();
				break;
			
			case 2:
				//sort array using modified bubble sort and display a second time.
				cls();
				title("Sort and Print Option");
				printer(sort(textList, cnt, timeHolder),cnt);
				System.out.print("List was sorted in ");
				System.out.printf("%1.3f", timeHolder[0]);
				System.out.println(" seconds");
				System.out.println("Press enter to continue...");
				scanner.nextLine();
				break;
				
			case 3:
				cls();
				mainFlag = false;
				title("Exit Screen");
				System.out.println("Thanks for using my program!");
				break;
				
				default:
					cls();
					title("Error Page");
					System.out.println("You've entered an invalid input...");
					System.out.println("Please follow the instructions.");
					System.out.println("Enter to continue");
					scanner.nextLine();
					break;
			}
		
			
		}while(mainFlag);
		

		
		scanner.close();
	}
	
	public static void title(String sub)
	{
		System.out.println("Text File String Sorter");
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
	
	public static String[] sort(String[] toSortArray, int cnt, double[] timeHolder)
	{
		String[] copyArray = new String[1001];
		timeHolder[0] = 0.0;
		for(int i = 0; i<=cnt; i++)
		{
			copyArray[i] = toSortArray[i];
		}
		int flag = 0;
		int ctn = cnt;
		double tstart = 0.0;//starting time
		double tend = 0.0;//ending time
		String t = "";
		
		
		tstart = System.currentTimeMillis();
		do
		{
			flag = 0;
			for(int i = 1; i<ctn; i++)
			{
				if(copyArray[i].compareTo(copyArray[i+1])>0)
				{
					t=copyArray[i];
					copyArray[i]=copyArray[i+1];
					copyArray[i+1]=t;
					flag = i;
				}
			}
			ctn = flag;
		}while(flag!=0);
		tend = System.currentTimeMillis();
		timeHolder[0] = (tend-tstart)/1000;
		return copyArray;
	}//end of sort
	
	public static void printer(String[] toPrint, int cnt)
	{
		for(int i=1; i<=cnt; i++)
		{
			System.out.printf("%14s", i + " -> " + toPrint[i]);
			if(i%7==0)
			{
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}//end of printer
	
	public static String[] load() throws FileNotFoundException
	{
		File fileLoad = new File("text.txt");
		Scanner fileReader = new Scanner(fileLoad);
		String array[] = new String[1001];
		//takes first number for cnt
		array[0] = fileReader.nextLine();
		int cnt = 0;
		
		try
		{
			cnt = Integer.parseInt(array[0]);
		}
		catch(Exception ex)
		{
			cnt = -1;
		}
		
		for (int i = 1; i <= cnt; i++)
		{
			array[i] = fileReader.nextLine();
		}
		
		fileReader.close();
		return array;
	}//end of load
}
