//logical/generalize code for identity matrix
package arrays;
import java.util.Scanner;
public class identity_matrix1 {
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
		boolean isIdentity = true;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if((i==j&&arr[i][j]!=1)||(i!=j&&arr[i][j]!=0))
				{
					isIdentity=false;
					break;
				}

			}
		}
		if(isIdentity)
		{
			System.out.println("this is an identity matrix");
		}
		else
		{
			System.out.println("this is not an identity matrix");
		}
}
}