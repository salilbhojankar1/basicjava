//we can overload the main method
package polymorphism;

public class poly2 {

	public static void main(String[] args) 
	{
		System.out.println("this is main (strinf=g args[]) also which the jvm will call");
		main();
		main(100);
		poly2 p1 = new poly2();
		p1.main ("salil");
	}
	public static void main()
	{
		System.out.println("this is main () with 0 parameter");
	}
	public static void main(int xyz)
	{
		System.out.println("this is main () with integer parameter ="+xyz);
	}
	public static void main(String abc)
	{
		System.out.println("this is main () with String parameter ="+abc);
	}
}
