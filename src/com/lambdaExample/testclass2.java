package com.lambdaExample;

public class testclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for this type of lambda ex we have to add string value in Sports class
		Sports sp = (a)->{System.out.println(a);};	
		
		Sports sp1 = (b)->{System.out.println(b);};	
		Sports sp2 = (c)->{System.out.println(c);};	
		
		sp.nameofSports("cricket");
		sp1.nameofSports("football");
		sp2.nameofSports("Basketball");
		
	}

}
