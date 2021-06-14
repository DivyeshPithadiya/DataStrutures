package Searching;

import java.util.Scanner;
public class LinearSearch 
{
	
	// Linear Search function
	
	static String search(int[] a,int num)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				count++;
				break;
			}
		}
		
		if(count>0)
		{
			return "Number Found";
		}
		else 
		{
			return "Number not Found";
		}
	}
	
	
	public static void main(String args[])
	{
		
		int[] a= {3,5,1,4,6,7,1};
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number to be Find : ");
		int num=s.nextInt();
		
		System.out.println(search(a,num));
		
		
	}

}
