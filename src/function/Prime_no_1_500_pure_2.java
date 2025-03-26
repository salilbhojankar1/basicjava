package function;
import java.util.*;
public class Prime_no_1_500_pure_2 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number= ");
		int str =sc.nextInt();
		Prime_no_1_500_pure_2 object = new Prime_no_1_500_pure_2();
		
		int i,n,a,count=0;
		
		for(a=1;a<=500;a++) 
		{
			n=a;
			count=0;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
				if(object.isPrime(count))
				{
					System.out.println("prime no. is= "+n);
				}
		
		}
	}

		
				public boolean isPrime(int count){
			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

	}


