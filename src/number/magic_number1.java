//magic number
package number;
import java.util.*;
public class magic_number1 {

	public static void main(String[] args) {
		int n,rem=0,sum=0,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		n=sc.nextInt();
		num=n;
		while(num>9)
		{
			while(num>0)
			{
				rem=num%10;
				sum=sum+rem;
				num=num/10;		//removes the last digit of the number
			}
			num=sum;
			sum=0;
		}
		if(num==1)
		{
			System.out.println("the given number is magic number");
		}
		else
		{
			System.out.println("the given number is not magic number");
		}

	}

}
