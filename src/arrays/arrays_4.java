//largest number array
package arrays;
import java.util.*;
public class arrays_4 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int i;
			int largest=0,lp=0;
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
				System.out.println("largest number ="+largest+" position ="+lp);
}
}