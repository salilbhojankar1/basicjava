//for all Armstrong number
package number;
import java.util.Scanner;
public class _arm {

	public static void main(String[] args) {
		int n,sum=0,rem,count=0,copy,check;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number= ");
		n=sc.nextInt();
		copy=n;
		check=n;
		while(copy!=0)
		{
			rem=copy%n;
			copy=copy/10;
			count++;
		}
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==copy) {
     System.out.println(copy+" is armstrong number");
		}
		else
		{
			System.out.println(copy+" is not armstrong number");
		}
	}

}
