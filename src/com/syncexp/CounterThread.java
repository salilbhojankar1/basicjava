package com.syncexp;

public class CounterThread {

	public static void main(String[] args) throws InterruptedException
	{
		counter_java c = new counter_java();
		
		Thread t1 = new Thread()
				{
			public void run()
			{
				c.increment();
			}
			
				};
				
				Thread t2 = new Thread()
				{
			public void run()
			{
				c.increment();
			}
			
				};
				Thread t3 = new Thread()
				{
			public void run()
			{
				c.increment();
			}
			
				};
				
				t1.start();
				t2.start();
				t3.start();
				t1.join();
				t2.join();
				t3.join();
	}

}
