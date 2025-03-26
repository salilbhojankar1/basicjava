//create constructor
package constructor;

import java.util.*;

public class const1 {
	const1()// constructor
	{
		System.out.println("I am constructor");
	}

	public static void main(String[] args) {
		const1 obj = new const1();
		obj.display();
		obj.info();
	}
	public void display()
	{
	
		System.out.println("i am display");//local variable
	}
	public void info()
	{
		
		System.out.println("i am info");//local variable
	}

	

}
