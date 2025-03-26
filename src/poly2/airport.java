package poly2;

public class airport extends flight
{
	airport()
	{
		System.out.println("this is airport constructor");
	}
	String company = "vistara";
	
	public void display()
	{
		System.out.println(company);
		System.out.println(super.company);
		super.display();
	}

}
