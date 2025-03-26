package com.lambdaExample;

public class testclass_cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket c = new Cricket("India","Rohit Sharma","virat kohli","jasprit bumrah","rahul dravid");
		
		Cricket c1 = new Cricket("Australia","ricky ponting","david warner","mitchel starc","vitory");
		
		
		Sports sp= (cr)->{
			System.out.println(cr.country+" "+cr.captain);
			System.out.println(cr.best_bowler+" "+cr.best_batsman);
			System.out.println(cr.coach);
			System.out.println( );
		};
		
		Sports sp1= (cr)->{
			System.out.println(cr.country+" "+cr.captain);
			System.out.println(cr.best_bowler+" "+cr.best_batsman);
			System.out.println(cr.coach);
			
		};
		sp.nameofSports(c);
		sp1.nameofSports(c1);

	}

}
