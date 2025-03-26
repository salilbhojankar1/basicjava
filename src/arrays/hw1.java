// create an unsorted array of size 10 & find the 3rd largest & 3rd smallest number in that array
//bubble sort array
package arrays;
import java.util.Scanner;
public class hw1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
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
		System.out.println(" ");
		System.out.println("3rd largest no.: "+arr[7]);
		System.out.println("3rd smallest no.: "+arr[2]);

	}

}
