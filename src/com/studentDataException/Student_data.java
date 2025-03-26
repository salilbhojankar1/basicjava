package com.studentDataException;

public class Student_data {
	
	String st_name;
	int st_id;
	int st_percent;
	
	

	public Student_data(String st_name, int st_id, int st_percent) {
		super();
		this.st_name = st_name;
		this.st_id = st_id;
		this.st_percent = st_percent;
	}
	
	public static void display(Student_data stu) 
	{
		try {
		if(stu.st_percent>=40)
		{
			System.out.println(stu.st_name+" "+stu.st_id+" "+stu.st_percent);
		}
		else
		{
			throw new ArithmeticException("Sorry "+stu.st_name+" you have failed");
		}
	}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
