package com.setexamples;
import java.util. HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class BusData {

	public static void main(String[] args) {
		
		Bus b1 = new Bus(1001,"Lal Pari",150,"Pune","Satara");
		Bus b2 = new Bus(2002,"Primo Plus",1000,"Pune","Amravati");
		Bus b3 = new Bus(3003,"Shivshahi",1500,"Pune","Nagpur");
		Bus b4 = new Bus(4004,"Vidharbha",2000,"Pune","Banglore");
		Bus b5 = new Bus(5005,"Volvo",3000,"Pune","Goa");
		
		
		LinkedHashSet<Bus> set = new LinkedHashSet<Bus>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
//		for(Bus b : set)
//		{
//			System.out.println("Bus Details: ");
//			System.out.println(b.bus_id+" "+b.bus_name);
//			System.out.println(b.bus_from+" To  "+b.bus_to);
//			System.out.println("The Fare is "+b.bus_fare);
//			System.out.println( );
//		}
		
		Iterator<Bus> itr = set.iterator() ;
		while(itr.hasNext())
		{
			Bus b = itr.next();

			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_from+" To  "+b.bus_to);
			System.out.println("The Fare is "+b.bus_fare);
			System.out.println( );
			
//			if(b.bus_name.equals("Primo Plus"))						// this is use for perticular bus data 
			//			{
//																	
//				System.out.println("Bus Details: ");
//				System.out.println(b.bus_id+" "+b.bus_name);
//				System.out.println(b.bus_from+" To  "+b.bus_to);
//				System.out.println("The Fare is "+b.bus_fare);
//				System.out.println( );
//			}
		}
		
		
	}

}
