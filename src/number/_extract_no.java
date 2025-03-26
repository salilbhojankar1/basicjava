//extract the digits from number 
package number;
import java.util.Scanner;
public class _extract_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,rem;
    System.out.println("enter number= ");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    		while(n>0)
    		{
    			rem=n%10;
    			n=n/10;
    			System.out.println(rem);
    		}
    
	}

}
