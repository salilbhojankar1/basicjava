//reverse string alphabet method
package Strings;
import java.util.Scanner;
public class string7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();
		StringBuffer sb= new StringBuffer(str);
		 sb.reverse();
		 System.out.println(sb);
	}

}
