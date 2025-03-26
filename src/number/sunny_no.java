package number;

import java.util.Scanner;


public class sunny_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum;
		double sq;
		System.out.println("enter number= ");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		sum=n+1;
		
		sq=Math.sqrt(sum);
		if(sq-Math.floor(sq)==0)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println("not a sunny number");
		}
	}

}
