//code for prime factor 
package scanner;
import java.util.Scanner;
public class neww {
public static void main(String[] args) {
	int n,count=0,num=0,i,j;
	System.out.println("enter number=");
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
		if(n%i==0) 
		 	{    
				num=i;
				count=0;  // for new factor it is necessary to take count =0
				for(j=1;j<=num;j++)	
				{
					if(num%j==0)
					{
						count++;
					}
				}
					if(count==2)
					{
						System.out.println("prime numbers is= "+i);
					}
				}
			}
		  
		 
		}
	

