package com.lambdaExample;

public class testclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sports sp = (a,b)->{System.out.println("The Sports "+a+" has the budget of "+b);};
		Sports sp1 = (a,b)->{System.out.println("The Sports "+a+" has the budget of "+b);};
		Sports sp2 = (a,b)->{System.out.println("The Sports "+a+" has the budget of "+b);};
		
		
		sp.nameofSports("Cricket", 4000000);
		sp1.nameofSports("Football", 1000000);
		sp2.nameofSports("Basketball", 500000); */
		
		
		Sports sp = (a,b)->{return "The Sports "+a+" has the budget of "+b;};
		Sports sp1 = (a,b)->{return "The Sports "+a+" has the budget of "+b;};
		Sports sp2 = (a,b)->{return "The Sports "+a+" has the budget of "+b;};
		
		
		
		
		System.out.println(sp.nameofSports("Cricket", 4000000));
		System.out.println(sp1.nameofSports("Football", 1000000));
		System.out.println(sp2.nameofSports("Basketball", 500000));
		
	}

}
