// find the prime no. from 1 to 1000
package number;
public class prime_no {
public static void main(String[]args) {
	int i,n,a,count;
	
	for(a=1;a<=1000;a++) 
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
	if(count==2)
		System.out.println("prime no.= "+n);
	
	
}
}
}
