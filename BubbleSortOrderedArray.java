package CS121;
import java.util.Scanner;


	
public class BubbleSortOrderedArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double [][] sortTimes = new double [5][6];
		boolean flag = true;
		int generatedList1[] = new int[100001];
		int generatedList2[] = new int[100001];
		int generatedList3[] = new int[100001];
		int generatedList4[] = new int[100001];
		int cnt = 100000;//number of items to sort
		
		//main loop
		while(flag)
		{
			cls();
			title("Start");
			System.out.println("Welcome to the sorting machine!");
			System.out.println("This program will generate arrays of 100,000 random numbers and then sort them 5 times with");
			System.out.println("each specified sorting technique to get the average time to sort!");
			System.out.println();
			System.out.println("Press enter when you are ready to begin!");
			scanner.nextLine();
			
			cls();
			title("Sorting Screen");
			for(int i = 1; i<=5; i++)
			{
				
				generatedList1 = generator(cnt);
				
				for(int j = 1; j<=cnt; j++)
				{
					generatedList2[j] = generatedList1[j]; 
					generatedList3[j] = generatedList1[j]; 
					generatedList4[j] = generatedList1[j]; 
				}
				
				System.out.println("Generated Array of random numbers.");
				System.out.print("Now sorting array " + i + " with all sorts. Do not close!...");
				sortTimes[1][i] = sorts(generatedList1, "bubble", cnt);
				sortTimes[2][i] = sorts(generatedList2, "Obubble", cnt);
				sortTimes[3][i] = sorts(generatedList3, "Mbubble", cnt);
				sortTimes[4][i] = sorts(generatedList4, "Rbubble", cnt);
				System.out.println("Sorts " + i + " completed!");
				System.out.println();
			}
			System.out.println("Press enter to continue to the nice table!");
			scanner.nextLine();
			
			//table print
			cls();
			title("Nice Table View");
			System.out.printf("%18s", "Ordered Except Last");
			System.out.printf("%18s", "1");
			System.out.printf("%18s", "2");
			System.out.printf("%18s", "3");
			System.out.printf("%18s", "4");
			System.out.printf("%18s", "5");
			System.out.printf("%18s", "Average");
			System.out.println();
			System.out.printf("%18s", "Bubble sort");
			for(int i = 1; i<=5; i++)
			{
				System.out.printf("%18.3f", sortTimes[1][i]);
			}
			System.out.printf("%18.3f", easyAverage(sortTimes, 1));
			System.out.println();
			
			
			System.out.printf("%18s", "Optimial BS");
			for(int i = 1; i<=5; i++)
			{
				System.out.printf("%18.3f", sortTimes[2][i]);
			}
			System.out.printf("%18.3f", easyAverage(sortTimes, 2));
			System.out.println();
			
			
			System.out.printf("%18s", "Modified BS");
			for(int i = 1; i<=5; i++)
			{
				System.out.printf("%18.3f", sortTimes[3][i]);
			}
			System.out.printf("%18.3f", easyAverage(sortTimes, 3));
			System.out.println();
			
			
			System.out.printf("%18s", "Reverse BS");
			for(int i = 1; i<=5; i++)
			{
				System.out.printf("%18.3f", sortTimes[4][i]);
			}
			System.out.printf("%18.3f", easyAverage(sortTimes, 4));

			flag = false;
		}
		scanner.close();
	}//end of main
	
	
	public static double sorts(int[] toSortArray, String choice, int cnt)
	{
		double tstart = 0.0;//starting time
		double tend = 0.0;//ending time
		double time = 0.0;//amount of time between start and end
		int flag = 0;
		int ctn = 0;
		int t=0;//swap variable
		
		switch(choice)
		{
		case "bubble":
			//bland non optimized bubble
			tstart = System.currentTimeMillis();
			for (int j=1;j<=cnt;j=j+1)
			{
				for (int i = 1;i<=cnt-1;i=i+1)
				{
					if(toSortArray[i]>toSortArray[i+1])
					{
						t=toSortArray[i];
						toSortArray[i]=toSortArray[i+1];
						toSortArray[i+1]=t;
					}//end of if
				}//end of inner loop
			}//end of outer loop
			tend = System.currentTimeMillis();
			time = (tend-tstart)/1000;
			break;//end of bubble sort
			
			
		case "Obubble":
			//optimized bubble sort
			tstart = System.currentTimeMillis();
			for (int j=1;j<=cnt;j=j+1)
			{
				for (int i = 1;i<=cnt-j;i=i+1)
				{
					if(toSortArray[i]>toSortArray[i+1])
					{
						t=toSortArray[i];
						toSortArray[i]=toSortArray[i+1];
						toSortArray[i+1]=t;
					}//end of if
				}//end of inner loop
			}//end of outer loop
			tend = System.currentTimeMillis();
			time = (tend-tstart)/1000;
			break;//end of Obubble
			
		case "Mbubble":
			tstart = System.currentTimeMillis();
			ctn = cnt;
			do
			{
				flag = 0;
				for(int i = 1; i<ctn; i++)
				{
					if(toSortArray[i]>toSortArray[i+1])
					{
						t=toSortArray[i];
						toSortArray[i]=toSortArray[i+1];
						toSortArray[i+1]=t;
						flag = i;
					}
				}
				ctn = flag;
			}while(flag!=0);
			tend = System.currentTimeMillis();
			time = (tend-tstart)/1000;
			break;// end of Mbubble
			
		case "Rbubble":
			tstart = System.currentTimeMillis();
			int j=1;
			ctn = cnt-1;
			do
			{
				flag = 0;
				for(int i = ctn; i>=j; i--)
				{
					if(toSortArray[i]>toSortArray[i+1])
					{
						t=toSortArray[i];
						toSortArray[i]=toSortArray[i+1];
						toSortArray[i+1]=t;
						flag = i;
					}
				}
				j = flag;
			}while(flag!=0);
			tend = System.currentTimeMillis();
			time = (tend-tstart)/1000;
			break;
		}
		return time;
	}//end of sorts
	
	
	public static int[] generator(int cnt)
	{
		int[] complete = new int[100001];
		// generate cnt random numbers between 1 and 100000
		for (int i = 1; i<=cnt; i=i+1)
		{
			complete[i] = i+1;
		}
		complete[100000] = 1;
		return complete;
	}//end of generator
	
	
	public static void title(String sub)
	{
		System.out.println("Sorting Speed Comparisons");
		System.out.println("By Jonah Layman");
		System.out.println(sub);
		System.out.println();	
	}//end of title
	
	
	public static double easyAverage(double[][] array, int which)
	{
		double finish = 0.0;
		double temp = 0.0;
				
		for(int i = 1; i <= 5; i++)
		{
			temp += array[which][i];
		}
		 finish = temp/5;
		return finish;
	}//end of easyAverage
	
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
}
