//using global values create constructor and assign value in constructor

package statickeyword;

import java.util.*;

public class static1 
{
	int id;
	String name;
	static String college ="FC";
	
	public static1(int id, String name)
	{
		this.id=id;
		this.name= name;
	}
	public static1() {
		
	}

	public static void main(String[] args) {
		static1 obj = new static1(101,"sid");    // calling default constructor
		static1 obj1 = new static1(203,"salil");	//calling parameterized constructor 1
		static1 obj2 = new static1(204,"amol");		//calling parameterized constructor 2
		
		obj.display();// calling default constructor
		obj1.display();//calling parameterized constructor 1
		obj2.display();//calling parameterized constructor 2
		
		
	}
	public void display()
	{
	
		System.out.println(id+" "+name+" "+college);//local variable
	}


	

}