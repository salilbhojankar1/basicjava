//wrapper class
package com.wrapperclass;

public class wrapper {

	public static void main(String[] args) 
	{
		//auto boxing
		int a=100; //primitive type
		Integer ab= Integer.MAX_VALUE;
		System.out.println(ab);
		
		int b=100;
		Integer bc=null;
		System.out.println(bc);
		
		//unboxing
		
		Integer cd = Integer.MAX_VALUE;
		int xy = cd;
		System.out.println(xy);
		
		Integer ds = 1234;
		int cf = ds;
		System.out.println(cf);
		
	}

}
