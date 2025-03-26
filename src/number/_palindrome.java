//palindrome number
package number;
import java.util.Scanner;
public class _palindrome {
	
	public static void main(String[] args) {
		int n, rem,sum=0;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int copy=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;      //reverse the number
			n=n/10;
		}
		System.out.println("reverse= "+sum);
		if(copy==sum)
		{
			System.out.println("palindrome no.");
		}
		else {
			System.out.println("not palindrome no.");
		}
	}
	
}
