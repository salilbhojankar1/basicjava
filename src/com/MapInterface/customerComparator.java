package com.MapInterface;

import java.util.Comparator;

public class customerComparator implements Comparator<Customer> {

	public int compare(Customer C1,Customer C2) 
	{
		return C1.cust_name.compareTo(C2.cust_name);
		

	}

}
