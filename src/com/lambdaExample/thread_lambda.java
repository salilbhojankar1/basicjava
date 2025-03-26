package com.lambdaExample;

public class thread_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = ( )->{System.out.println("thread name ="+Thread.currentThread());

	};
	Thread t1 =new Thread (r1,"First");
	t1.start();
	Thread t2 =new Thread (r1,"second");
	t2.start();
	Thread t3 =new Thread (r1,"third");
	t3.start();
	}
}
