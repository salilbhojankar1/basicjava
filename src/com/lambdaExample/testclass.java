package com.lambdaExample;

public class testclass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sports sp= new Sports(){
		public void nameofSports()
		{
			System.out.println("cricket");
		}
	};
	
	Sports sp1 = new Sports(){
		public void nameofSports()
		{
			System.out.println("football");
		}
	};
	
	
	Sports sp2 = ()->{System.out.println("Basketball");};		//(">"---arrow token)       all this line is called lambda expression
	
	sp.nameofSports();
	sp1.nameofSports();
	sp2.nameofSports();
	}

}
