package com.streamexam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass_Employee {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(1001,"Sidharth","Trainer",100000);
		Employee emp2 = new Employee(1002,"Shubham","Manager",110000);
		Employee emp3 = new Employee(1003,"Gopal","Trainer",109000);
		Employee emp4 = new Employee(1004,"Ritesh","Trainer",200000);
		Employee emp5 = new Employee(1005,"Nitin","Operational Head",50000);
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		
//		int total_salary = emplist.stream().map(emp->emp.salary).reduce(0,(total,salary)->total+salary); //it add all salaries
		int total_salary = emplist.stream().filter(emp->emp.salary>100000).map(emp->emp.salary).reduce(0,(total,salary)->total+salary);
		System.out.println(total_salary);
		
		
		Employee e =emplist.stream().max((e1,e2)->e1.salary>e2.salary?1:-1).get(); 
		System.out.println(e.name+" " + e.Designation+" "+e.salary);

		Employee em =emplist.stream().min((e1,e2)->e1.salary>e2.salary?1:-1).get();  
		System.out.println(em.name+" "+em.Designation+" "+em.salary);
		
		
		Map<String, String> empMap = emplist.stream().collect(Collectors.toMap(emp->emp.name,emp->emp.Designation));
		System.out.println(empMap);
		
//		//List<Employee> empData = emplist.stream().filter(emp->emp.Designation.equals("Trainer")).map(emp->emp).collect(Collectors.toList());
//		List<Employee> empData = emplist.stream().filter(emp->emp.salary>=100000).map(emp->emp).collect(Collectors.toList());
//		
//		
//		
//		for(Employee e : empData)
//		{
//			System.out.println(e.id+" "+e.name+" "+e.Designation+" "+e.salary);
//			
//			
//		}
		

	}

}