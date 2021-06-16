package Sorting;
import java.util.Scanner; 

public class SelectionSort 
{
	
	public static void sort(int[] a)
	{
		
		// Selection sort Logic
		
		for(int i=0;i<a.length;i++)
		{
			int min=a[i];
			int pos=i;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		
		// Selection sort Logic
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		int[] a=new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=s.nextInt();
		}
		
		sort(a);
		
		
	}

}
