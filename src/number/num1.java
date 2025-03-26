// 3 digit Armstrong number 
package number;
import java.util.Scanner;
public class num1 {

	public static void main(String[] args) {
		int n,sum=0,rem;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number= ");
		n=sc.nextInt();
		int copy=n;
		for(;n>0;)
		
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
