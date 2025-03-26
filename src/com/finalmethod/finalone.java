package com.finalmethod;

public class finalone extends finalparent {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// if we use final keyword we cannot change the variable
		// for ex:-
		/* 
		 * final String name = "Siddharth";
			System.out.println(name);
			name = "java";     here we cannot change 'name'
			System.out.println(name); 
		*/
		
		String name = "Siddharth";
		finalparent f1 = new finalone();
		f1.display();
		System.out.println(f1.age);
	}
		
		public void display()
		{
			System.out.println("this is display of child class");
		}
	}


