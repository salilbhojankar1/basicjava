//2nd way to solve
package number;
import java.util.Scanner;
public class prime_palindrome_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int i,a,n,rem,count,sum;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number= ");
       n=sc.nextInt();
       int copy = n;
       count=0;
       sum=0;
       for(i=1;i<=n;i++)
       {
    	   if(n%i==0) 
    	   {
    		   count++;
    	   }
    	   if(count==2)
    	   while(n>0)
    	   {
    		   rem=n%10;
    		   sum=(sum*10)+rem;
    		   n=n/10;
    	   }
    	}
    	   if(copy==sum)
    	   {
    		   System.out.println("prime palindrome");
    	   }
    	   else
    	   {
    		   System.out.println("not prime palindrome");
    	   }
       
	}
       
       }


