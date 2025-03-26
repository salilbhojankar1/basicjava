//using global values create constructor and assign value in constructor

package constructor;

import java.util.*;

public class const2 {
	int id;
	String name;
	const2()                               //default constructor
	{
		id=101;
		name= "salil";
	}
	const2(int i)                               //parameterized constructor 1
	{
		id=10;
		name= "rushikesh";
	}
	const2(int a,String n)                               //parameterized constructor 2
	{
		id=a;
		name= n;
	}

	public static void main(String[] args) {
		const2 obj = new const2();    // calling default constructor
		const2 obj1 = new const2(23);	//calling parameterized constructor 1
		const2 obj2 = new const2(23,"amol");		//calling parameterized constructor 2
		
		obj.display();// calling default constructor
		obj1.display();//calling parameterized constructor 1
		obj2.display();//calling parameterized constructor 2
		
		obj.info();// calling default constructor
		obj1.info();//calling parameterized constructor 1
		obj2.info();//calling parameterized constructor 2
	}
	public void display()
	{
	
		System.out.println(id+" "+name);//local variable
	}
	public void info()
	{
		
		System.out.println(id+" "+name);//local variable
	}

	

}