package com.syncexp3;

public class bank_thread {

	public static void main(String[] args) throws InterruptedException {
		
		bank b = new bank(10000);
		
		Thread t1 =new Thread() 
		{
			public void run() 
			{
				b.deposite();
			}
		};
		Thread t2 =new Thread() 
		{
			public void run() 
			{
				b.withdraw();
			}
		};
		Thread t3 =new Thread() 
		{
			public void run() 
			{
				b.deposite();
			}
		};
		Thread t4 =new Thread() 
		{
			public void run() 
			{
				b.withdraw();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		
	}

}
