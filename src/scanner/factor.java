package scanner;
import java.util.Scanner;
public class factor {

	public static void main(String[] args) {
		int i,n;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
