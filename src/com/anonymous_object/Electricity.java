package com.anonymous_object;

public class Electricity 
{
	String company;
	double bill_amount;
	double subsidy;
	Customer c;
	


	public Electricity(String company, double bill_amount, double subsidy, Customer c) 
	{
		
		this.company = company;
		this.bill_amount = bill_amount;
		this.subsidy = subsidy;
		this.c = c;
	}
	void display()
	{
		System.out.println("company"+company+"Bill Amount"+bill_amount+"Subsidy"+subsidy+"Customer ID"+c.cust_id+c.cust_name+c.units_consumed);
	}
	public static void main(String[] args)
	{
		Customer c1 = new Customer("512","Tushar kale","50 units");
	

	}

}
