package Strings;

import java.util.Scanner;

public class piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();
		
	
	    String s1="",s2="",s3="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				s1= str.substring(i);
				break;
			}
			
			else 
			{
				 s2=s2+ch;
			}
		}
		s3=s1+s2+"ay";
		System.out.print(s3);
	}

}
