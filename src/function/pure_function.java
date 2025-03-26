// in pure function public class always define by data type instead of void & and use "return" function
package function;

public class pure_function {
	public static void main(String[] args) {
		pure_function obj = new pure_function();
		String fname = obj.display("salil");
		System.out.println(fname);
}
	public String display(String name)
	{
		String fullname = name +"bhojankar";
		return fullname;
	}
}
