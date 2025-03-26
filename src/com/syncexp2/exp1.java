package com.syncexp2;

public class exp1 {
	int n, rem,sum=0;
public synchronized void  palin()
{
	
	
	for(int i=10;i<=1000;i++)
	{
		 n=i;
		sum=0;
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;      //reverse the number
		n=n/10;
		
		
	}
	if(sum==i)
	{
		System.out.println(i);
	}
	}

}


}
