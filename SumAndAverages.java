package CS121;

public class SumAndAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int total = 0;
		double average = 0;
		
		num1=10;
		num2=12;
		num3=19;
		num4=21;
		num5=30;
		total=(num1+num2+num3+num4+num5);
		average=total/5.0;
		System.out.println("Set 1:  Total = "+total+","+" Average = "+average);
		
		
		//reassigning the variables for the second set
		num1=1;
		num2=3;
		num3=20;
		num4=26;
		num5=29;
		total=(num1+num2+num3+num4+num5);
		average=total/5.0;
		System.out.println("Set 2:  Total = "+total+","+" Average = "+average);
		
		
		//reassigning the variables again for set 3
		num1=6;
		num2=7;
		num3=16;
		num4=29;
		num5=30;
		total=(num1+num2+num3+num4+num5);
		average=total/5.0;
		System.out.println("Set 3:  Total = "+total+","+" Average = "+average);

	}//end of main

}//end of file
