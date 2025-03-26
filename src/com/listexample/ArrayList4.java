package com.listexample;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList<String> city1 = new ArrayList<String>();
		
		city1.add("pune");
		city1.add("mumbai");
		city1.add("Nashik");
		city1.add("pune");
		city1.add("Mumbai");
		city1.add("Nashik");
		
		System.out.println(city1);
		
		
//		for(String c : city1)			//for each loop
//		{
//			System.out.println(c);
//		}
		
		
		Iterator<String> itr = city1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
