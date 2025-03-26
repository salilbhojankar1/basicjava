package statickeyword;

public class ststicblock {
	static int count;
	static
	{
		count=0;
		System.out.println("It is ststic block");
	}
	ststicblock()
	{
		count++;
		System.out.println("this is constructor "+count);
	}
	

	public static void main(String[] args) {
		ststicblock c1 = new ststicblock();
		ststicblock c2 = new ststicblock();
		ststicblock c3 = new ststicblock();
		System.out.println("thisnis main method");
	}

}
