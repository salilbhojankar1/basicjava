// selection sort
package arrays;
import java.util.*;
public class selection_array1 {

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
		//loop for selection sorted array
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])    // ">" for ascending order "<" for descending order
				{
				//swapping method
					copy=arr[i];
					arr[i]=arr[j];					
					arr[j]=copy;
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
