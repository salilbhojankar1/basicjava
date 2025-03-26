//replace string
package Strings;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Cyber";
		StringBuffer sb= new StringBuffer(str);
		 sb.replace(1, 3, "Success");
		 System.out.println(sb);
	}

}
