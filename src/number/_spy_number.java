package number;

public class _spy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1123,rem, sum=0,prod=1;
		while(n>0)
		{
		
			rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(prod==sum)
			System.out.println("it is spy number");
		
		else
			System.out.println("it is not spy number");
	}


	}


