package Recursion;
import java.util.Scanner;

public class factorial 
{
	public static int factorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else 
		{
			return num*factorial(num-1);
		}
	}
	
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		
		System.out.println("Factorial Of Number is :"+factorial(num));

	}
	

}
