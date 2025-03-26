package inheritance_ex2;

public class student_detail {

	public static void main(String[] args)
	{
		Student stu = new Student();
		System.out.println(stu.st_name);
		System.out.println(stu.st_department);
		
		subject sub = new subject();
		sub.mark();
		System.out.println(sub.s1);
		System.out.println(sub.s2);
		System.out.println(sub.s3);
		System.out.println(sub.s4);
		
		System.out.println("over all grade");
		
		grade g =new grade();
		System.out.println(g.g_rade);
		g.grd();
		
		graduate grad = new graduate();
		grad.gr1();
		
		Undergraduate u_grad = new Undergraduate();
		u_grad.gr();

	}

}
