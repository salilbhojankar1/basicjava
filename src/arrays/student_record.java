//using scanner method
package arrays;
import java.util.*;
public class student_record {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stu[]=new String[5];
		int s1[]=new int[5];
		int s2[]=new int[5];
		int s3[]=new int[5];
		int s4[]=new int[5];
		int s5[]=new int[5];
		int i;
		//taking input
		for(i=0;i<stu.length;i++)
		{
			System.out.println("Student Name :");
			stu[i]=sc.nextLine();
			System.out.println("enter the marks= ");
			s1[i]=sc.nextInt();
			s2[i]=sc.nextInt();
			s3[i]=sc.nextInt();
			s4[i]=sc.nextInt();
			s5[i]=sc.nextInt();
		}
		//executing output
		for(i=0;i<stu.length;i++)
		{
			int total=0;
			double percentage=0.0;
			total=s1[i]+s2[i]+s3[i]+s4[i]+s5[i];
			percentage=total/5;
			System.out.println("Student= "+stu[i]);
			System.out.println("Percentage= "+percentage+"%");
		}
	}

}
