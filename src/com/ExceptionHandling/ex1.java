package com.ExceptionHandling;

public class ex1 {

	public static void main(String[] args) {
		
		int arr[] = {10,23,54,65,46};
		System.out.println(arr.length);
		try {
			System.out.println("This should surely get Executed");
														//only one try block allowed
			arr[1] = 10%0;								//try block is only use where we have doubt that give exception
														//in try block there is only one exception allowed
			System.out.println("Executed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
