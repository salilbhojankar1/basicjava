package com.setexamples;
import java.util. HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Bus2Data{

	public static void main(String[] args) {
		
		Bus2 b1 = new Bus2(1001,"Lal Pari",150,"Pune","Satara");
		Bus2 b2 = new Bus2(2002,"Primo Plus",100,"Pune","Amravati");
		Bus2 b3 = new Bus2(3003,"Shivshahi",150,"Pune","Nagpur");
		Bus2 b4 = new Bus2(4004,"Vidharbha",200,"Pune","Banglore");
		Bus2 b5 = new Bus2(5005,"Volvo",300,"Pune","Goa");
		
		
		TreeSet<Bus2> set = new TreeSet<Bus2>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		

		Iterator<Bus2> itr = set.iterator() ;
		while(itr.hasNext())
		{
			Bus2 b = itr.next();

			System.out.println("Bus Details: ");
			System.out.println(b.bus_id+" "+b.bus_name);
			System.out.println(b.bus_from+" To  "+b.bus_to);
			System.out.println("The Fare is "+b.bus_fare);
			System.out.println( );
		
		
		
	}

}
}