//using buffered Reader method 
package arrays;
import java.io.*;
public class student_record_1{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			stu[i]=br.readLine();
			System.out.println("enter the marks= ");
			s1[i]=Integer.parseInt(br.readLine());
			s2[i]=Integer.parseInt(br.readLine());
			s3[i]=Integer.parseInt(br.readLine());
			s4[i]=Integer.parseInt(br.readLine());
			s5[i]=Integer.parseInt(br.readLine());
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
