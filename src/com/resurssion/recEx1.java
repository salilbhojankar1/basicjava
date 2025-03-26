package com.resurssion;

public class recEx1 {
	static int fact=1;
	public static void slogan(int i) 
	{
		if(i<=5)
		{
		      fact=fact*i;

//			System.out.println("I am salil");
			i++;
			slogan(i);
			
		}
		
	}
	
	public static void main(String []args) {
		slogan(1);
		System.out.println(fact);
	}

}
