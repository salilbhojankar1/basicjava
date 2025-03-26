//2d array arr[][]
package arrays;
import java.util.*;
public class two_d_array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int arr[][]= new int[3][3];
		System.out.println("enter the values: ");
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]= sc.nextInt();

			}
		}
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
		
		System.out.println("length of array= "+arr.length);
	}
}



