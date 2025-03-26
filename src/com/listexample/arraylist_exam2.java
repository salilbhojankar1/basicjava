package com.listexample;

import java.util.ArrayList;

public class arraylist_exam2 {


		public static void main(String[] args) {
			ArrayList<String> city1 = new ArrayList<String>();
			
			
			city1.add("pune");
			city1.add("mumbai");
			city1.add("hingoli");
			
			System.out.println(city1);
			
			
ArrayList<String> city2 = new ArrayList<String>();
			
			
			city2.add("ayodhya");
			city2.add("mumbai");
			city2.add("mathura");
			
			System.out.println(city2);
			city1.addAll(city2);
			
			city1.retainAll(city2);
			System.out.println(city1);      //it is use to collect common name
			
			city1.set(3, "vrindavan");		//change the data
			
			System.out.println(city1);
			System.out.println(city1.get(3));		//specify data insert
			
			city1.remove(2);	// it will remove the data
			System.out.println(city1.hashCode());
			
			city1.remove("mumbai");
			System.out.println(city1);
			
			city1.removeAll(city2);
			System.out.println(city1);
			
			System.out.println(city1.contains("pune"));
			
			city1.clear();				//clear method use to clear/remove all data
			
			System.out.println(city1.isEmpty());   
			
			
		}

}
