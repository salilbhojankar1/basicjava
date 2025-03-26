package com.lambdaExample;

import java.util.ArrayList;

public class lambda_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Mahindra thar");
		cars.add("Tata Nexon");
		cars.add("Toyota Innova");
		cars.add("Tata Nano");
		cars.add("Maruti Alto");
		
		System.out.println(cars);
//		
//		for(String s:cars)
//		{
//			System.out.println(s);
//		}

		cars.forEach((n)->System.out.println(n));
		
	}

}
