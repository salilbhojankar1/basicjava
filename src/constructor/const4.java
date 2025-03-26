//using "this" keywords 
package constructor;

import java.util.*;

public class const4 {
	
	
	int id;
	String name;
	const4(int id,String name)// constructor
	{
		this.id=id;
		this.name= name;
	}
	

	public static void main(String[] args) {
		const4 obj = new const4(1,"salil");
		obj.display();
		
	}
	public void display()
	{
	
		System.out.println(id+" "+name);//local variable
	}
	

}