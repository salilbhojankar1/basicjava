package number;
import java.util.Scanner;
public class _perfect_number {
	public static void main(String[] args) {
		int n,sum=0,i;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println("it is perfect number");
		else
			System.out.println("it is not perfect number");
	}
}
