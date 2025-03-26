//bubble sort array
package arrays;

import java.util.Scanner;

public class bubble_sort1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[5];
		int i,j;
		int copy=0;
		System.out.println("enter the unsorted numbers: ");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//loop for bubble sort array
		for(i=(arr.length-2);i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				if(arr[j]>arr[j+1])    // ">" for ascending order "<" for descending order
				{
				//swapping method
					copy=arr[j];
					arr[j]=arr[j+1];					
					arr[j+1]=copy;
				}
			}
		}
		//loop for printing sorted array
		for(i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]+" ");
		}

	}

}
