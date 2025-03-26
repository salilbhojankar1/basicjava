package com.ExceptionHandling;

public class nullpointerException1 {

	public static void main(String[] args) {
		System.out.println("Good morning all!...");
		
//		nullpointerException1 obj= null;
//		nullpointerException1 obj2= null;			
		String str=null;			//finally 
		try {
//			if(obj.equals("hello"))
//			if(obj.equals(obj2))
			if(str.isEmpty())
			{
				System.out.println("danger");
			}
			else
			{
				System.out.println("ye toh khali hai");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();		//this is use for all exception details
		}
		finally 		// weather there is an exception or not, finally block will always execute & it use at the last after catch block
		{
			System.out.println("this is always executed");
		}
		
		

	}

}
