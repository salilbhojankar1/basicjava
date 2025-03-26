package com.MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class fligtTestHashMap {

	public static void main(String[] args) {
	
		Flight1 fly1= new Flight1 ("Indigo","Pune","Bengaluru",4500);
		Flight1 fly2= new Flight1 ("Spice Jet","Pune","Nagpur",5000);
		Flight1 fly3= new Flight1 ("Vistara","Pune","Delhi",8000);
		Flight1 fly4= new Flight1 ("Akasa Airs","Pune","Mumbai",2000);
		Flight1 fly5= new Flight1 ("Air India","Pune","Chennai",10000);
		
//		HashMap<String,Flight1> map = new HashMap<String,Flight1>();
		
		Customer C1 = new Customer (101,"Gaurav Zavade","Viman Nagar,Pune","(+91)-9579231682");
		Customer C2 = new Customer (202,"Tushar Anna","Hinjewadi,Pune","(+91)-8976565434");
		Customer C3 = new Customer (303,"Anil Dada","Hadpsar,Pune","(+91)-7576454678");
		Customer C4 = new Customer (404,"Piyush Nana","Karve Nagar,Pune","(+91)-874536212");
		Customer C5 = new Customer (505,"Adarsh Tatya","Mundawa,Pune","(+91)-7584637865");
		
//		HashMap<Customer,Flight1> map = new HashMap<Customer,Flight1>();
		TreeMap<Customer,Flight1> map = new TreeMap<Customer,Flight1>(new customerComparator());
		
	
		
		map.put(C1, fly1);
		map.put(C2, fly2);
		map.put(C3, fly3);
		map.put(C4, fly4);
		map.put(C5, fly5);
		
		
		
		
		Set<Map.Entry<Customer,Flight1>> set = map.entrySet();
		for(Map.Entry<Customer, Flight1>m:set)
		{
			
			
			System.out.println(" Flight Booking Conformation: ");
			Customer c =m.getKey();
			System.out.println("ID: "+c.cust_id+" "+"Name: "+c.cust_name);
			System.out.println("Mob No: "+c.phone_no);
			System.out.println("Address: "+c.cust_address);
			
			
			Flight1 f = m.getValue();
			
		
			System.out.println("Flight: "+f.f_name);
			System.out.println("Departure: "+f.f_departure+" ,  "+"Arrival: "+f.f_arrival);
			System.out.println("Fare: "+f.f_fare);
			System.out.println();
		}
		
		

	}

}
