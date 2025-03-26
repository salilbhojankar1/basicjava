//largest number & smallest number array
package arrays;
import java.util.*;
public class array_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int i;
			int largest=0,lp=0,smallest,sp=0;
			int arr[]=new int[10];
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]>largest)
				{
					largest=arr[i];
					lp=i;
				}
				
			}
			smallest=largest;
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]<smallest)
				{
					smallest=arr[i];
					sp=i;
				}
			}
			
			System.out.println("Largestnumber= "+largest+" position= "+lp);
			System.out.println("smallestnumber= "+smallest+" position= "+sp);
	}

}
