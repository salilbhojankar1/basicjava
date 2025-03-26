//here we can see the global variable c=300 is print in main method we have to call it by instance obj.c
package function;

public class exxx {
		int c=300;//global variable
	public static void main(String[] args) {
		int b=200;//instance variable
		exxx obj = new exxx();
		System.out.println(obj.c);
		obj.display();
		obj.info();
	}
	public void display()
	{
		int a=100;
		System.out.println(c);//local variable
	}
	public void info()
	{
		int x=400;
		System.out.println(c);//local variable
	}

}
