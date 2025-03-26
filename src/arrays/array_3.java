//smallest number array
package arrays;
import java.util.*;
public class array_3{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
	int i;
	int a=0,b=0,smallest=Integer.MAX_VALUE,sp=0;			//used wraper class
	int arr[]=new int[10];
	for(i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();						//scanner use to put value
	}
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]>a)
		{
			a=arr[i];								// for find  number one of largest
			b=i;
		}
	
		if(arr[i]<smallest) 				// for smallest number
		{
		smallest=arr[i];
		sp=i;
		}
	}
	System.out.println("smallest number ="+smallest+" position ="+sp);
	}
}
