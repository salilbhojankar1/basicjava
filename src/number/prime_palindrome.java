//1st way to solve 
package number;

public class prime_palindrome 
{
	public static void main(String[] args) 
	{
	int i,n,a,count,sum,rem;
		int copy;
		for(a=1;a<=100000;a++) 
		{
			n=a;
			count=0;
			sum=0;
			copy=n;
			for(i=1;i<=n;i++)
			{
			if(n%i==0)
				{
				count++;
				}
		
			}	
			if(count==2)
			{
				while(n>0)
				{
					rem=n%10;
					sum=(sum*10)+rem;
					n=n/10;
				}
				if(sum==copy)
					System.out.println(a+"prime palindrome");
			}
		}

}
	}