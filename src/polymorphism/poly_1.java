//method over loading
package polymorphism;

public class poly_1 {

	public static void main(String[] args) 
	{
		poly_1 p1 = new poly_1();
		p1.display();
		p1.display(100);
		display(false);
		p1.display(true);
		p1.display(0.0,1.0);
		p1.display(80000,true,"MC Stan");
	}
 public String display()					// return type
 {
	return "jay shree ram !";
 }
 public void display(int price)
 {
	 System.out.println("Average price of majority product in FC road is ="+price);
 }
 public static void display(boolean check)		// static type
 {
	 System.out.println("Answer the statement is true or false");
	 System.out.println("will RCB will win 2024 IPL ="+check);
 }
 public void display(double a,double b)
 {
	 System.out.println("Math.random will generate random number between "+a+"and"+b);
 }
 public void display(int price, boolean state, String name)
 {
	 System.out.println("The statement "+price+ " 'ke shoes hai lavde ghar chale jayenga isme, tera ghar chale jayenga isme' is "+state+" and said by "+name);
 }
}
