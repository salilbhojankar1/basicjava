//palindrome string using string ".equals" method
package Strings;
import java.util.*;
public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();
		StringBuffer sb= new StringBuffer(str);
		 sb.reverse();
		 System.out.println(sb);
		 String str1= sb.toString();
		 if(str.equals(str1))
		 {
			 System.out.println("palindrome string");
		 }
		 else
		 {
			 System.out.println("not a palindrome string");
		 }
	}

}
