package patterns;

public class triangle1{

public static void main(String[] args) {

	int i,j;
	for(i=1;i<=5;i++) 			//i stands for rows
	{
		for(j=1;j<=i;j++)		//j stands for column
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	}
}
