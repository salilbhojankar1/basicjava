package Strings;
import java.util.*;
public class string1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();
		String i= new String(str);
		int b;
		int vowel=0, consonent=0;
				for(b=0;b<str.length();b++)
				{
					char ch=str.charAt(b);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					{
						vowel++;
					}
					else
					{
						consonent++;
					}
				}
		System.out.println("vowels= "+ vowel);
		System.out.println("consonent= "+ consonent);

}
}