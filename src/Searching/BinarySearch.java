package Searching;
import java.util.Scanner;

public class BinarySearch 
{
	static int count=0;
	public static String search(int num,int start,int end,int[] a)
	{
		int mid=(start+end)/2;
		
		if(start>end)
		{
			count=0;
		}
		else 
		{
			if(a[mid]==num)
			{
				count++;
			}
			else 
			{
				if(num<a[mid])
				{
					end=mid-1;
					search(num,start,end,a);
				}
				if(num>a[mid])
				{
					start=mid+1;
					search(num,start,end,a);
				}
			}
		}
		
		if(count>0)
		{
			return "Number Found ";
		}
		else 
		{
			return "Number not found";
		}
		
		
		
		
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number to Search :");
		int num= s.nextInt();
		int[] a= {3,4,5,6,7,8,9,10};
		System.out.println(search(num,0,a.length-1,a));
		
	}

}
