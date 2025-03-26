package constructor;

import java.util.*;

public class const3 {
	int id;
	String name;
	const3(int i,String n)// constructor
	{
		id=i;
		name= n;
	}
	const3(const3 o)//copy  constructor
	{
		id=o.id;
		name= o.name;
	}

	public static void main(String[] args) {
		const3 obj = new const3(1,"salil");
		const3 obj1 = new const3(obj);
		obj.display();
		obj.info();
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