package number;
import java.util.Scanner;
public class neon_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sq,n,sum=0,rem;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter number= ");
			n= sc.nextInt();
			sq=n*n;
			while(sq>0) 
			{
				rem=sq%10;
				sum=sum+rem;
				sq=sq/10;	
			}
			if (sum==n)
			{
				System.out.println("Neon");
			}
			else
			{
				System.out.println("not neon");
			}
	}

}
