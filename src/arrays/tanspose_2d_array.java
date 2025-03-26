package arrays;

import java.util.Scanner;

public class tanspose_2d_array {

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
			System.out.println("original matrix");
			for(i=0;i<3;i++)
			{

				for(j=0;j<3;j++)
				{
					
					System.out.print(arr[i][j]+" ");
					}
					System.out.println(" ");
			}
			//printing transpose
			System.out.println("transpose matrix");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					
					System.out.print(arr[j][i]+" ");
					}
					System.out.println(" ");
			}
	}

}
