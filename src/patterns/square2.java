// hollow square pattern
package patterns;

public class square2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) 			//i stands for rows
		{
			for(j=1;j<=5;j++)		//j stands for column
			{
				if(i==1||i==5||j==1||j==5)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println("");
		} 

	}

	}
