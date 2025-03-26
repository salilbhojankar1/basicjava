// parent ke class se child class ko banana is called as runtime polymorphism
package poly1;

public class testclass {

	public static void main(String[] args)
	{
		/*bank b = new bank();  
		boi o = new boi();		
		hdfc h = new hdfc();	
		icici i = new icici();
		sbi s = new sbi();	*/
		
		
		//OR
		
		/*bank b = new bank();  
		bank o = new boi();		// here we can use parent class 'bank' to create child class object
		bank h = new hdfc();	// here we can use parent class 'bank' to create child class object
		bank i = new icici();	// here we can use parent class 'bank' to create child class object
		bank s = new sbi();		// here we can use parent class 'bank' to create child class object
		
		b.generate(6);
		o.generate(5);
		h.generate(7);
		i.generate(6);
		s.generate(8); 
		*/
		
		//OR
		
		bank b;
		b= new boi();
		b.generate(5);
		b= new hdfc();
		b.generate(7);
		b= new icici();
		b.generate(6);
		b= new sbi();
		b.generate(8);

	}

}
