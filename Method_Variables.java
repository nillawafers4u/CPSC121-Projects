package CS121;

public class Method_Variables 
{

	public static void main(String[] args) 
	{
		int x = 47;
		int y = 56;
		int sum = 0;
		cls();
		System.out.println("Hello Dr. K"); 
		sum = add(x,y);
		System.out.println("The sum is " + sum);
	
	}//end of main
	
	public static void cls() 
	{
		for (int i=1;i<=50;i++)
		{
			System.out.println();
		}
	}//end of cls method
	
	public static void num()
	{
		int x = 7;
		int y = 8;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}//end of num
	
	public static int add(int a, int y)
	{
		if(a == 47)
		{
			return 12;
		}
		return (a + y);
	}//end of add

}//end of class
