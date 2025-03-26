package com.setexamples;

public class Bus2 implements Comparable<Bus2>  {
	int bus_id;
	String bus_name;
	int bus_fare;
	String bus_from;
	String bus_to;
	
	
	public Bus2(int bus_id, String bus_name, int bus_fare, String bus_from, String bus_to) {
		super();
		this.bus_id = bus_id;
		this.bus_name = bus_name;
		this.bus_fare = bus_fare;
		this.bus_from = bus_from;
		this.bus_to = bus_to;
	}

//
//	@Override
//	public int compareTo(Bus2 b) {
//		if (bus_fare<b.bus_fare) 
//		{
//			return 0;
//		}
//		else if(bus_fare>b.bus_fare) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
	
	public int compareTo(Bus2 b)
	{
		return bus_name.compareTo(b.bus_name);
	}

}