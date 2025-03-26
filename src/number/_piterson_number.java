// find piterson number
package number;

import java.util.Scanner;

public class _piterson_number {
	public static void main(String[] args) {
		int i,n,sum=0,rem,fact;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int copy=n;
		while(n>0)
		{
			rem=n%10;
			fact=1;
			for(i=1;i<=rem;i++)
				{
					fact=fact*i;
				}
			sum=sum+fact;
			n=n/10;
		}
			if(copy==sum)
				System.out.println("it is piterson number");
		
			else
				System.out.println("it not is piterson number");
	}
}
