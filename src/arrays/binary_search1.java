//binary search
package arrays;
import java.util.*;
public class binary_search1 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] =new int[10];
		int i,l=0,u=9,mid=0,count=0;
		System.out.println("Enter the values in ascending sorted order: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the search number: ");
		int search=sc.nextInt();
		
		while(l<=u)
		{
			mid=(l+u)/2;
			if(arr[mid]>search)
			{
				u=mid-1;
			}
			else if(arr[mid]<search)
			{
				l=mid+1;
			}
			else
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("search number "+search+"Found in "+(mid+1)+"position");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
