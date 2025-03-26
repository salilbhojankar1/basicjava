
package number;


//sunny numbers in between range 0 to n.....

public class sunny_no_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum,a;
		double sq;
		
		
		for(a=1;a<=10000;a++)
		{
			n=a;
		sum=n+1;
		sq=Math.sqrt(sum);
		if(sq-Math.floor(sq)==0)
		{
			System.out.println(a+"sunny number");
		}
	}

}}
