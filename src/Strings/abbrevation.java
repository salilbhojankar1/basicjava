package Strings;

import java.util.Scanner;

public class abbrevation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string= ");
		String str = sc.nextLine();
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==32)    //here it take ascii value of spece " "=32
			{
				 s1 = str.substring(i);
				break;
			}
			
		}
		String s2="Mr. "+str.charAt(0)+"."+s1;
		System.out.println(s2);
	}

}
