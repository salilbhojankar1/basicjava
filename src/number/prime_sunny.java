package number;

public class prime_sunny {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,n,a,count,sum;
		double sq;
		for(a=1;a<=100000;a++) 
		{
			n=a;
			count=0;
			sum=0;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
			{
					count++;
			}
		}
			if(count==2) 
			{
				sum=n+1;
				sq=Math.sqrt(sum);
				if(sq-Math.floor(sq)==0)
				System.out.println(a+" prime sunny");
			}
		}
	}

}
