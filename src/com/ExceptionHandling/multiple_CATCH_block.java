package com.ExceptionHandling;

public class multiple_CATCH_block {

	public static void main(String[] args) {
		
		int arr[] = {10,23,54,65,46};
		System.out.println(arr.length);
		try {
														//only one try block allowed
			arr[10] = 10%2;								//try block is only use where we have doubt that give exception
														//in try block there is only one exception allowed
		}
														//it will take nearest exception first
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

		catch(RuntimeException e)
		{
			System.out.println("jai bajrang bali");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}

	}

}
