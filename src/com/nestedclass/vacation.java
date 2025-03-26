package com.nestedclass;

public class vacation {
	
	private int a=20;
	int b=28;
	public void data()
	{
		System.out.println("Thank you all!");
	}
	 public class dontdisturb
	{
		 void details()
		{
			System.out.println("I am on vacation from "+a+" to "+b+" march");
		}
	
		public void detail()
		{
			System.out.println("From 20th to 28th march");
		}
		public void info()
		{
			System.out.println("This is to inform all of you!");
		}
	}
	public static void main(String ages[])
	{
		vacation vac = new vacation();
		vacation.dontdisturb obj = vac.new dontdisturb();

		
		obj.detail();
		obj.info();
		obj.details();
		vac.data();
	}

}
