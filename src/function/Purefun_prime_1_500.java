/*write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise.
  Also write main method that displays prime numbers between 1-500 (using pure function method)*/
package function;
import java.util.*;
public class Purefun_prime_1_500 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number= ");
		 int str = sc.nextInt();
		
		Purefun_prime_1_500 object =new Purefun_prime_1_500();    //create object class
		boolean b=object.isPrime(str);
		System.out.println(b);
		int i,j,mount,n;
		 	/*for(i=1;i<=500;i++) {
		 		n=i;
		 		count=0;
		 		for(j=1;j<=i;j++) {
		 			if(i%j==0)
		 			{
		 				count++;
		 			
		 			}
		 	}
		 		if (count==2)
		 		{
		 			System.out.print(i+" ,");
		 		}
		 		}*/
		 	}
		 	
			public boolean isPrime(int i)
			{
				int mount=0;
				
				for(int j=1;j<=i;j++)
				{
				
					if(i%j==0)
					{
						mount++;
					}
				}
					if(mount==2)
					{
					return true;
					}
					else
					{
					return false;
					}
			
			}
			}

	
	

