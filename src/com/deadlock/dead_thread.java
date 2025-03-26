package com.deadlock;

public class dead_thread {

	public static void main(String[] args)  {
		
		deadlock dc = new deadlock();
		
		Thread t1= new Thread() 
		{ public void run() 
		{
			dc.display();
			dc.info();
		}
			
		};
		
		Thread t2= new Thread() 
		{ public void run() 
		{
			
			dc.info();
			dc.display();
		}
			
		};
		
		
		t1.start();
		t2.start();
		
}
	}