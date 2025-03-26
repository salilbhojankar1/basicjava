//identity matrix code by taking index numbers 
package arrays;

import java.util.Scanner;

public class identity_matrix {

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
		
	
			if(arr[0][0]==1&&(arr[1][1]==1)&&(arr[2][2]==1)&&(arr[0][1]==0)&&(arr[0][2]==0)&&(arr[1][0]==0)&&(arr[1][2]==0)&&(arr[2][0]==0)&&(arr[2][1]==0))
				{
					System.out.println("identity matrix");
					
				}
			else
				{
					
					System.out.println("not an identity matrix");
				}
			}	
	}


