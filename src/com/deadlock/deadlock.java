package com.deadlock;

public class deadlock {
	
	String city = "pune";
	String state = "maharashtra";
	String country= "India";
	 public void display() {
		 synchronized(city) 
		 {
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				e.printStackTrace();
			 }
			 System.out.println("This is pune city!");
		 }
		 synchronized(state) 
		 
		 {
			 System.out.println("welcome to maharashtra!");
		 }
 synchronized(country) 
		 
		 {
			 System.out.println("atithi devo bhava!");
		 }
	 }

	public  void info() 
	{
		synchronized(country) 
		 
		 {
			 System.out.println("atithi devo bhava!");
		 } 
		synchronized(state) 
		 
		 {	 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
			 System.out.println("welcome to maharashtra!");
		 }
		 synchronized(city) 
		 {
			 System.out.println("This is pune city!");
		 }
		
	}

}
