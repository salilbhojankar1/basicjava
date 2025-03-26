//pure function vowels
package function;
import java.util.*;
public class vowels_pure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word= ");
		String str= sc.nextLine();
		vowels_pure obj= new vowels_pure();
		int count=0,b=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i); 
			boolean a=obj.isvowel(ch);
			if (a==true)
			{
				count++;
			}
			else
			{
				b++;
			}
		}
		System.out.println("vowels= "+count);
		System.out.println("true= "+count++);
			System.out.println("false= "+b++);
		}
		public boolean isvowel(char ch)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				return true;
			}
			else
			{
				return false;
			}
		}	
	}


