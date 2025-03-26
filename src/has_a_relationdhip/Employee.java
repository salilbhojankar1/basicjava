package has_a_relationdhip;

public class Employee {
	
	int e_id;
	String e_name;
	String e_email;
	Address add;
	
	public Employee(int e_id,String e_name,String e_mail,Address add)
	{
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_email=e_email;
		this.add=add;
	}
	
	public void display()
	{
		System.out.println("Id= "+e_id+"Name= "+e_name+"Email= "+e_email);
		System.out.println("Address= ");
		System.out.println(add.street+" "+add.city+" "+add.state+" "+add.pincode);
	}

	public static  void main(String[] args) {
		Address add1 = new Address("Goodluck cafe street,", "pune,","Maharashtra-",411007);
		Address add2 = new Address("Nanded city,", "pune,","Maharashtra-",423007);
		Employee emp1= new Employee(101,"sid","xyz@haha.com",add1);
		Employee emp2= new Employee(102,"salil","abc@haha.com",add2);
		emp1.display();
		emp2.display();
		

	}

}
