//abbrevation using indexOf()
package Strings;

public class string3
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str= "salil bhojankar";
				
				int i= str.indexOf(' ');
				String s1 = str.substring(i);
				System.out.println("Mr. "+str.charAt(0)+"."+s1);
	}
}