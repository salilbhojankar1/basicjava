package com.syncexp;

public class counter_java {
			int count = 10;
	public synchronized void  increment()
	{
		for(int i=0;i<=10;i++)
		{
			count=count+5;
			System.out.println(count);
		}

	}
	public int getcount()
	{
		return count;
	}

}
