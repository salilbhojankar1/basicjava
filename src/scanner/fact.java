package scanner;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		int i,n;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<n;i++) {
			if(n%i==0) {
				if(i%2==0)	{    // it is for only even no.
					System.out.println(i);
				}
				
			}
		}

	}

}
