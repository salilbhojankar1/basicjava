package statickeyword;

public class counter {

	
		static int count =0;
		counter()
		{
			count++;
			System.out.println(count);
			
		}
		public static void main(String[] args) {
	
		counter obj =new counter();
		counter obj1 =new counter();
		counter obj3 =new counter();
		obj.display();
		obj1.display();
		obj3.display();
}
public void display() {
	
}
}

