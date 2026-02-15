package CS121;

import java.util.Scanner;

public class BubbleSort {

	//This is a sample for the Bubble Sort
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int [] a = new int [100001];//array to sort
			int [] b = new int [100001];//baseline to be used later
			int i = 0;//loop variable
			int j = 0;//loop variable
			int t=0;//swap variable
			int cnt = 100000;//number of items to sort
			double n = 0.0;//for random number generator
			double start = 0.0;//starting time
			double end = 0.0;//ending time
			double time = 0.0;//amount of time between start and end
			String enter = "";//string variable
			// generate cnt random numbers between 1 and 100000 to be used as a sorting array example
			for (i = 1; i<=cnt; i=i+1)
			{
				n = Math.random();
				a[i] = (int) (n*100000 + 1);
				b[i]=a[i];//will be used as a baseline later
			}
			System.out.println("All Done Generating "+ cnt + " Numbers");
			System.out.println("Press enter to show a sample of the unsorted list");
			enter = in.nextLine();
			// display the first 100 unsorted items
			for (i=1;i<=20;i=i+1)
			{
				System.out.printf("%10d", a[i]);
				System.out.printf("%10d", a[i+20]);
				System.out.printf("%10d", a[i+40]);
				System.out.printf("%10d", a[i+60]);
				System.out.printf("%10d",a[i+80]);
				System.out.println();
			}
			// This is a bubble sort
			System.out.println("Press enter to begin the bubble sort");
			enter = in.nextLine();
			start = System.currentTimeMillis();
			for (j=1;j<=cnt;j=j+1)
			{
				for (i = 1;i<=cnt-1;i=i+1)
				{
					if(a[i]>a[i+1])
					{
						t=a[i];
						a[i]=a[i+1];
						a[i+1]=t;
					}//end of if
				}//end of inner loop
			}//end of outer loop
			end = System.currentTimeMillis();
			time = (end-start)/1000;
			System.out.println("I have bubble sorted " + cnt + " items using " + cnt * (cnt-1) + " comparisions in " + time +" seconds");
			System.out.println("Press enter to show a sample of the sorted list");
			enter = in.nextLine();
			// display part of the sorted list
			for (i=1;i<=20;i=i+1)
			{
				System.out.printf("%10d", a[i]);
				System.out.printf("%10d", a[i+20]);
				System.out.printf("%10d", a[i+40]);
				System.out.printf("%10d", a[i+60]);
				System.out.printf("%10d\n",a[i+80]);
			}
			in.close();
	}//end of main

}
