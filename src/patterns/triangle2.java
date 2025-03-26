//  
package patterns;

public class triangle2{

public static void main(String[] args) {

	int i,j;
	for(i=5;i>=1;i--) 			//i stands for rows
	{
		for(j=5;j>=i;j--)		//j stands for column
		{
			System.out.print(j);
		}
		System.out.println("");
	}
	}
}
