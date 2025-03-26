package com.syncexp2;


public class exp1Thread  {

	public static void main(String[] args) throws InterruptedException{
exp1 e = new exp1();
		
		Thread t1 = new Thread()
				{
			public void run()
			{
				e.palin();
			}
			
				};
				
				Thread t2 = new Thread()
				{
			public void run()
			{
				e.palin();
			}
			
				};
				Thread t3 = new Thread()
				{
			public void run()
			{
				e.palin();
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
