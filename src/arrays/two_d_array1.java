//2d array (arr[][])& find the sum of rows & find largest & lowest number 
package arrays;
import java.util.*;
public class two_d_array1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int arr[][]= new int[3][3];
		System.out.println("enter the values: ");
		int i,j,largest=Integer.MIN_VALUE,lp=0,sp=0,smallest=Integer.MAX_VALUE;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
		// loop for sum of rows
		for(i=0;i<3;i++)
		{
			int sum=0;
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
				System.out.println("= "+sum);
				System.out.println(" ");
		}
		// loop for find largest and smallest number
			for(i=0;i<arr.length;i++)
			{
				for(j=0;j<arr.length;j++)
				{
					if(arr[i][j]>largest)
					{
						largest=arr[i][j];
						lp=i;
					}
					if(arr[i][j]<smallest)
					{
						smallest=arr[i][j];
						sp=i;
					}
				}
			}
			System.out.println("length of array= "+arr.length);
			System.out.println("largest number= "+largest);
			System.out.println("smallest number= "+smallest);
		
	}
}



