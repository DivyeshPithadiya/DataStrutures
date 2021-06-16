package Sorting;
import java.util.Scanner;

public class BubbleSort 
{
	public static int[] sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					// swap 
					
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}
		}
		
		
		return a;
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Array Elements : ");
		int[] a=new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		
		int[] b=sort(a);
		
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}

}
