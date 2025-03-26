package com.MapInterface;

public class Customer /*implements Comparable<Customer> */{
	
	int cust_id;
	String cust_name;
	String cust_address;
	String phone_no;
	
	
	public Customer(int cust_id, String cust_name, String cust_address, String phone_no) {
		
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.phone_no = phone_no;
	}
	
//	public int compareTo(Customer c)
//	{
//		return cust_name.compareTo(c.cust_name);
//	}
	
	
}
