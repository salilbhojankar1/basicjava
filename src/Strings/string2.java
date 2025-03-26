//LOWERCASE TO UPPERCASE
package Strings;
import java.util.Scanner;
public class string2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();

		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				int d= ch-32;
				char x= (char)d;
				System.out.print(x);
			}
			else
			{
				int d= ch+32;
				char x= (char)d;
				System.out.print(x);
		    }
		}
		
	}
}