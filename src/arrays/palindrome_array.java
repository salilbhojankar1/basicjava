//code for palindrome number array 
package arrays;
import java.util.*;
public class palindrome_array {

	public static void main(String[] args) {
		int i;
		Scanner sc =new Scanner(System.in);
		int arr[]= new int[10];
		int pal[]= new int[10];		
		System.out.println("enter value: ");
		for (i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		int n,rem,sum=0;
		int copy,r=0;
		for (i=0;i<arr.length;i++)
		{
			n=arr[i];
			copy=n;
			sum=0;
			while(n>0)
			{
				rem=n%10;
				sum=(sum*10)+rem;      //reverse the number
				n=n/10;
			}
		if(copy==sum)
		{
			pal[r]=sum;					//for printing palindrome number
			r++;
		}
		}
		for(i=0;i<pal.length;i++) 
		{
			System.out.println(pal[i]+" ");
		}
	}

}
